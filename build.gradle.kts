// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
}
buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.2")
        classpath ("com.android.tools.build:gradle:8.0")
    }
}
