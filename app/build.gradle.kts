plugins {
  alias(libs.plugins.android.app)
  alias(libs.plugins.kotlin)
  alias(libs.plugins.androidx.navSafeArgs)
  id("kotlin-parcelize")
}

android {
  namespace = "com.farmbuddy"
  compileSdk = 33

  defaultConfig {
    applicationId = "com.farmbuddy"
    minSdk = 23
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }

  kotlinOptions {
    jvmTarget = "11"
  }

  buildFeatures {
    viewBinding = true
  }
}

dependencies {
  implementation(libs.androidx.appcompat)
  implementation(libs.androidx.constraintlayout)
  implementation(libs.androidx.coreKtx)
  implementation(libs.androidx.navFragmentKtx)
  implementation(libs.androidx.navUiKtx)
  implementation(libs.androidx.navDynamicFeatures)
  implementation(libs.google.material)

  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}