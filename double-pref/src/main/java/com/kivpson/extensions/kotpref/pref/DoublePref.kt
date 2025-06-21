package com.kivpson.extensions.kotpref.pref

import android.annotation.SuppressLint
import android.content.SharedPreferences
import com.chibatching.kotpref.KotprefModel
import com.chibatching.kotpref.execute
import com.chibatching.kotpref.pref.AbstractPref
import kotlin.reflect.KProperty

/**
 * Delegate double shared preferences property.
 * @param default default double value
 * @param key custom preferences key
 * @param commitByDefault commit this property instead of apply
 */
public fun KotprefModel.doublePref(
    default: Double = 0.0,
    key: String? = null,
    commitByDefault: Boolean = commitAllPropertiesByDefault
): AbstractPref<Double> = DoublePref(default, key, commitByDefault)

/**
 * Delegate double shared preferences property.
 * @param default default double value
 * @param key custom preferences key resource id
 * @param commitByDefault commit this property instead of apply
 */
public fun KotprefModel.doublePref(
    default: Double = 0.0,
    key: Int,
    commitByDefault: Boolean = commitAllPropertiesByDefault
): AbstractPref<Double> = doublePref(default, context.getString(key), commitByDefault)

internal class DoublePref(
    val default: Double,
    override val key: String?,
    private val commitByDefault: Boolean
) : AbstractPref<Double>() {
    override fun getFromPreference(property: KProperty<*>, preference: SharedPreferences): Double {
        return preference.getDouble(preferenceKey, default)
    }

    @SuppressLint("CommitPrefEdits")
    override fun setToPreference(
        property: KProperty<*>,
        value: Double,
        preference: SharedPreferences
    ) {
        preference.edit().putDouble(preferenceKey, value).execute(commitByDefault)
    }

    override fun setToEditor(
        property: KProperty<*>,
        value: Double,
        editor: SharedPreferences.Editor
    ) {
        editor.putDouble(preferenceKey, value)
    }
}

//
// ! SharedPreferences extension

fun SharedPreferences.Editor.putDouble(key: String, value: Double): SharedPreferences.Editor {
    return putLong(key, value.toRawBits())
}

fun SharedPreferences.getDouble(key: String, defaultValue: Double): Double {
    return Double.fromBits(getLong(key, defaultValue.toRawBits()))
}