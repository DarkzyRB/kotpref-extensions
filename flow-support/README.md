# KotPref Flow Support

[![](https://jitpack.io/v/darkzyrb/kotpref-extensions.svg)](https://jitpack.io/#darkzyrb/kotpref-extensions)

This module provides **Flow support** for [KotPref](https://github.com/chibatching/Kotpref) models.

## ✨ Features

- Observe `KotprefModel` properties as a `Flow<T>`
- Designed to work with Jetpack Compose, Coroutines, and reactive architectures
- Automatically listens and emits preference changes in real time

---

## 💡 Example Usage

```kotlin
object LocationPref : KotprefModel() {
    var accuracy by doublePref(0.0)
}

val accuracyFlow: Flow<Double> = LocationPref.asFlow(LocationPref::accuracy)
```

You can then collect this flow in your repositories, use cases, or Compose UI:

```kotlin
accuracyFlow.collect { newAccuracy ->
    // React to changes
}
```

---

## 📦 Installation

Add JitPack to your project-level settings.gradle.kts or repositories block:

```kotlin
maven { url = uri("https://jitpack.io") }
```

Add the dependency:

```kotlin
implementation("com.github.darkzyrb.kotpref-extensions:flow-support:1.2.2")
```

---

## 🛠 Requirements
- Kotlin 1.9+
- Kotpref 2.13.1+
- Android minSdk 21+
- kotpref 2.13.2+

---


## 📚 Related

- [double-pref module](https://github.com/darkzyrb/kotpref-extensions/tree/master/double-pref)

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).