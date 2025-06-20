plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.maven.publish)
}

android {
    namespace = "com.kivpson.extensions.kotpref.pref"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotpref)
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "https://github.com/DarkzyRB"
            artifactId = "kotpref-double-extension"
            version = "1.0.0"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}