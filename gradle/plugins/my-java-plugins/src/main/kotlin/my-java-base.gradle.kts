plugins {
    id("java")
    id("com.diffplug.spotless")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.compileTestJava {
    options.encoding = "UTF-8"
}

tasks.register<JarCount>("countJars") {
    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
}

tasks.register<Zip>("bundle") {
    group = "my group"
    description = "packages it all!"
    from(tasks.jar)
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}