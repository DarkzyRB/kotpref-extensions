# KotPref Extensions

[![](https://jitpack.io/v/darkzyrb/kotpref-extensions.svg)](https://jitpack.io/#darkzyrb/kotpref-extensions)

A collection of lightweight Kotlin extensions for [KotPref](https://github.com/chibatching/Kotpref), enhancing its capabilities with additional data types and reactive support.

This repository includes modular extensions designed to be used independently or together.

---

## 📦 Available Modules

| Module         | Description                                      | Dependency |
|----------------|--------------------------------------------------|------------|
| **double-pref** | Adds native `Double` support to `KotprefModel`  | `com.github.darkzyrb.kotpref-extensions:double-pref:1.2.2` |
| **flow-support** | Enables reactive `Flow<T>` support for KotPref  | `com.github.darkzyrb.kotpref-extensions:flow-support:1.2.2` |

> 💡 All modules are available via [JitPack](https://jitpack.io/#DarkzyRB/kotpref-extensions).

---

## 🛠️ Installation

1. Add JitPack to your root `settings.gradle.kts` or `build.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

2. Add the module(s) you want to your build.gradle.kts:

```kotlin
implementation("com.github.darkzyrb.kotpref-extensions:double-pref:1.2.2")
implementation("com.github.darkzyrb.kotpref-extensions:flow-support:1.2.2")
```

---

## 🔧 Kotlin Version Compatibility

These extensions follow semantic versioning:

```css
A.B.C

A → Project major version  
B → Compatible KotPref version  
C → Internal changes or patches
```

*Example: 1.2.2 is compatible with KotPref v2.x.*

---


## 🧩 Related Projects

- [double-pref module](https://github.com/darkzyrb/kotpref-extensions/tree/master/double-pref)
- [flow-support module](https://github.com/darkzyrb/kotpref-extensions/tree/master/flow-support)

---

## 📄 License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).