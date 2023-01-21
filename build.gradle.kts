buildscript {
    dependencies {
        classpath("com.dicedmelon.gradle:jacoco-android:0.1.5")
    }
}

plugins {
    id("com.android.application") version "7.4.0-beta05" apply false
    id("com.android.library") version "7.4.0-beta05" apply false
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
}
