# KotPref Double Extension

[![](https://jitpack.io/v/darkzyrb/kotpref-extensions.svg)](https://jitpack.io/#darkzyrb/kotpref-extensions)


An extension for [Kotpref](https://github.com/chibatching/Kotpref) that adds support for `Double` types in `SharedPreferences` and enables seamless usage of `Double` properties in `KotprefModel`.

---

## ✨ Features

- Full support for `Double` preferences using Kotlin property delegation.
- Integrates directly with `KotprefModel`.
- Stores values as `String` to maintain floating-point precision.
- Lightweight and easy to use.

---

## 🧩 Installation

Add JitPack to your `repositories` block:

```kotlin
repositories {
    maven { url = uri("https://jitpack.io") }
}
```
Then add the dependency:

```kotlin
dependencies {
    implementation("com.github.darkzyrb.kotpref-extensions:double-pref:1.2.2")
}
```
---

## 🚀 Usage
```kotlin
object TaxPref : KotprefModel() {
    var taxRate by doublePref(0.0)
}
```

You can also specify a custom key:
```kotlin
var taxRate by doublePref(default = 0.12, key = "tax_rate")
```

---

## 🛠 Requirements
- Kotlin 1.9+
- Kotpref 2.13.1+
- Android minSdk 21+
- kotpref 2.13.2+

---

## 📖 How it works

The doublePref() delegate uses a custom DoublePref class that:

- Stores values as String in SharedPreferences.
- Reads values using .toDoubleOrNull().

This allows accurate representation and retrieval of decimal numbers without floating-point loss.

---

## 🧩 Related Projects

- [flow-support module](https://github.com/darkzyrb/kotpref-extensions/tree/master/flow-support)

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).