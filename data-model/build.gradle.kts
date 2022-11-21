/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    id("java") // Would apply core java functionality, but it is already composed within java-library
    id("java-library")    // already applies id("java"), but they won't be applied twice, so that doesn't make a difference
}

/**
 * EXTENSIONS
 * We can extend a plugin, like the above java, witch is included in java-library
 */
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}