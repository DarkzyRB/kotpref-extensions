package com.kivpson.extensions.kotpref.flow_support

import android.content.SharedPreferences
import com.chibatching.kotpref.KotprefModel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlin.reflect.KProperty0

fun <T> KotprefModel.asFlow(property: KProperty0<T>): Flow<T> = callbackFlow {
    val key: String = this@asFlow.getPrefKey(property)
        ?: throw IllegalArgumentException("Failed to get preference key, check property ${property.name} is delegated to Kotpref")

    val listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, propertyName ->
        // propertyName will be null when preferences are cleared on Android R
        val isCleared = propertyName == null
        if (isCleared || propertyName == key) {
            trySend(property.get()).isSuccess
        }
    }

    // Emit initial value
    trySend(property.get()).isSuccess

    this@asFlow.preferences.registerOnSharedPreferenceChangeListener(listener)

    awaitClose {
        this@asFlow.preferences.unregisterOnSharedPreferenceChangeListener(listener)
    }
}