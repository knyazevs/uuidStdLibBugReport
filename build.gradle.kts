plugins {
    kotlin("js") version "2.0.21"
}

group = "io.github.knyazevs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    js() {
        nodejs()
        binaries.library()
        binaries.executable()
    }
}

configure<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension> {
    version = "18.20.3"
}