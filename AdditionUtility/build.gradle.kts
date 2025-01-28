plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")    // New Added
}

android {
    namespace = "com.gsm.additionutility"
    compileSdk = 34

    defaultConfig {
        minSdk = 28

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            consumerProguardFiles("consumer-rules.pro")      // ADD This
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

// New Added
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17)) // Use Java 17
    }
}

// New Added
//publishing {
//    publications {
//        create<MavenPublication>("maven") {
//            groupId = "com.github.ganpatmalekar" // Replace with your GitHub username
//            artifactId = "SampleAdditionSDK"            // Replace with your repository name
//            version = "1.0.5"                // Replace with your desired version
//
//            pom {
//                description.set("This is sample addition library") // Replace with your library description
//            }
//
//            // Attach the library's AAR or JAR file
//            from(components["release"]) // Ensure "release" component exists in your module
//        }
//    }
//    repositories {
//        mavenLocal() // Publishes to your local Maven repository
//    }
//}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.ganpatmalekar" // Replace with your GitHub username
            artifactId = "SampleAdditionSDK"     // Replace with your repository name
            version = "1.0.6"                    // Replace with your desired version

            // Use the AAR file produced by the release build
            afterEvaluate {
                from(components["release"])
            }

            pom {
                name.set("AdditionUtility")  // Library name
                description.set("This is a sample addition library") // Library description
                url.set("https://github.com/ganpatmalekar/SampleAdditionSDK") // Repository URL
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("ganpatmalekar")
                        name.set("Ganpat Malekar")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/ganpatmalekar/SampleAdditionSDK.git")
                    developerConnection.set("scm:git:ssh://github.com/ganpatmalekar/SampleAdditionSDK.git")
                    url.set("https://github.com/ganpatmalekar/SampleAdditionSDK")
                }
            }
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://jitpack.io") // Use JitPack's Maven repository
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}