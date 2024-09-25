plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.retrofitapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.retrofitapp"
        minSdk = 24
        targetSdk = 34
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
}

dependencies {
    implementation("com.google.dagger:dagger:2.52")
    annotationProcessor("com.google.dagger:dagger-compiler:2.52")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation("io.insert-koin:koin-core:3.4.0")
    implementation("io.insert-koin:koin-java:3.4.0")
    implementation("io.insert-kotlin:kotlin-android:3.4.0")
//    implementation("io.insert-koin:koin")

    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}