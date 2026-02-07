plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.xdustatom.auryxgamenews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.xdustatom.auryxgamenews"
        minSdk = 23
        targetSdk = 34
        versionCode = 120701
        versionName = "1.207.01"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
        debug {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
