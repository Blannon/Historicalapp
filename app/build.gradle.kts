plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.eshaan.historicalapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.eshaan.historicalapp"
        minSdk = 24
        targetSdk = 35
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
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildFeatures {
        viewBinding = true
    }
//    kapt {
//        correctErrorTypes = true
//    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.9.0")
    implementation ("androidx.activity:activity-ktx:1.10.1")
    implementation ("androidx.fragment:fragment-ktx:1.8.6")

    // Navigation Component
    implementation ("androidx.navigation:navigation-fragment-ktx:2.9.0")
    implementation ("androidx.navigation:navigation-ui-ktx:2.7.7")

    // Hilt for dependency injection
    implementation ("com.google.dagger:hilt-android:2.56.2")
    kapt ("com.google.dagger:hilt-android-compiler:2.56.2")

    // Retrofit for network requests
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.11.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.11")

    // Coroutines for asynchronous programming
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Testing dependencies
    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.mockito:mockito-core:5.10.0")
    testImplementation ("org.mockito.kotlin:mockito-kotlin:3.2.0")
    testImplementation ("org.mockito:mockito-inline:5.2.0")

    testImplementation ("androidx.arch.core:core-testing:2.2.0")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}