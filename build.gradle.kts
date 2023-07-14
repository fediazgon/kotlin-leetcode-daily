plugins {
    kotlin("jvm") version "1.8.0"
    id("com.diffplug.spotless")
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