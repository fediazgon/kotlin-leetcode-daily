plugins {
    kotlin("jvm") version "1.8.0"
    id("com.ncorti.ktfmt.gradle") version "0.12.0"
    application
}

group = "me.fernandodiaz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}