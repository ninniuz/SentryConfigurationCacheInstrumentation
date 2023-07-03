import io.sentry.android.gradle.extensions.InstrumentationFeature

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("io.sentry.android.gradle") version "3.11.0"
}

android {
    namespace = "it.ninniuz.android.sentry.cc.instrumentation"
    compileSdk = 33

    defaultConfig {
        applicationId = "it.ninniuz.android.sentry.cc.instrumentation"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    sentry {
        tracingInstrumentation {
            debug.set(true)
        }
    }
}

dependencies {

    implementation("io.sentry:sentry-android:6.23.0")
    implementation("androidx.sqlite:sqlite-framework:2.3.1")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
}