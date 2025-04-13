import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinCocoapods)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "16.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-core:3.5.3")
                implementation("io.ktor:ktor-client-core:2.3.9")
                implementation("io.ktor:ktor-client-cio:2.3.9")
                implementation("io.ktor:ktor-client-content-negotiation:2.3.9")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.9")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
                // Add more common deps here
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("io.insert-koin:koin-android:3.5.3")
                implementation("io.ktor:ktor-client-okhttp:2.3.9")
                implementation("androidx.room:room-runtime:2.6.1")
                implementation("androidx.room:room-ktx:2.6.1")
                // Add Android-specific deps here
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.example.bimpair"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}