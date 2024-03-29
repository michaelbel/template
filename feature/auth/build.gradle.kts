@file:Suppress("UnstableApiUsage")

import org.michaelbel.template.dependencies.implementationFacebookDependencies
import org.michaelbel.template.dependencies.implementationHiltDependencies
import org.michaelbel.template.dependencies.implementationVkDependencies

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "org.michaelbel.template.auth"
    compileSdk = libs.versions.compile.sdk.get().toInt()

    defaultConfig {
        compileSdk = libs.versions.compile.sdk.get().toInt()
        minSdk = libs.versions.min.sdk.get().toInt()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlin.compiler.extension.get()
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(":core"))
    implementationHiltDependencies()
    implementationFacebookDependencies()
    implementationVkDependencies()
}