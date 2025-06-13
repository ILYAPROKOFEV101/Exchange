plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.ilya.compose_utils"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation ("androidx.compose.ui:ui:")
    implementation ("androidx.compose.material3:material3:")
    implementation ("androidx.compose.runtime:runtime:")

    // AndroidX Compose BOM (Bill of Materials)
    implementation(platform("androidx.compose:compose-bom:2025.06.00"))

    // Core Compose UI
    implementation(libs.ui)

    // Material 3 for Compose
    implementation(libs.material3)

    // Runtime for Compose
    implementation(libs.androidx.runtime)
}