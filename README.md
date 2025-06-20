# KotPref Double Extension

[![](https://jitpack.io/v/TU_GITHUB_USERNAME/kotpref-double-extension.svg)](https://jitpack.io/#TU_GITHUB_USERNAME/kotpref-double-extension)

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
