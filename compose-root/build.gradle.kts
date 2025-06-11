plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.ilyamylibrary"
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

    implementation(project(":Currencies:ui"))
    implementation(libs.androidx.navigation.compose.v290)
    // AndroidX Compose BOM (Bill of Materials)
    implementation(libs.androidx.compose.bom.v20250600)

    // Core Compose UI
    implementation(libs.ui)

    // Material 3 for Compose
    implementation(libs.material3)

    // Runtime for Compose
    implementation(libs.androidx.runtime)


}