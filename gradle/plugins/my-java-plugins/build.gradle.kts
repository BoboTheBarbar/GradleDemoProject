plugins {
    /**
     * This plugin, tells the project, that we will write plugins (in kotlin) within it.
     */
    `kotlin-dsl`    // syntax only for kotlin. NOT id("kotlin-dsl")
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.8.0")
}