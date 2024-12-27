plugins {
    kotlin("jvm") version "2.0.0"
    id("maven-publish")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

kotlin {
    jvmToolchain(21)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifact(tasks.jar)
        }
    }
    repositories {
        maven {
            url = uri(layout.buildDirectory.dir("repository"))
        }
    }
}
