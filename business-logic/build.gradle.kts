/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    id("java-library")    // apply a plugin with id() and gradle-core offers a java plugin
}

/**
 * EXTENSIONS
 * We can extend a plugin, like the above java, witch is included in java-library
 */
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}