import org.michaelbel.template.CompileSdk
import org.michaelbel.template.MinSdk
import org.michaelbel.template.TargetSdk

plugins {
    id("com.android.library")
}

android {
    compileSdk = CompileSdk

    defaultConfig {
        minSdk = MinSdk
        targetSdk = TargetSdk
    }
}

dependencies {
    api(project(":features:ads"))
    api(project(":features:clipboard"))
    api(project(":features:constraintlayout"))
    api(project(":features:fonts"))
    api(project(":features:ime"))
    api(project(":features:inappreview"))
    api(project(":features:intents"))
    api(project(":features:location"))
    api(project(":features:receiver"))
    api(project(":features:remoteconfig"))
    api(project(":features:service"))
    api(project(":features:storage"))
    api(project(":features:toast"))
}