buildscript {
    dependencies {
        classpath("com.dicedmelon.gradle:jacoco-android:0.1.5")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.jetbrains.kotlinx.kover") version "0.6.1"
}

koverMerged {
    enable()
}
