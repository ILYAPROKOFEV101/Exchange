plugins {
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.android.library)

}

android {
    namespace = "com.ilya.ui"
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

    implementation ("androidx.core:core-ktx:1.16.0")
    implementation ("androidx.compose.ui:ui:1.8.2")
    implementation ("androidx.compose.material3:material3:1.3.2")
    implementation ("androidx.navigation:navigation-compose:2.9.0")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:2.1.20")

    implementation(project(":compose-utils"))

}