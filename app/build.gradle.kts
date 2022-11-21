/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    // application add functionality for packaging and running java applications
    id("application")    // apply a plugin with id() and gradle offers a java plugin
}

/**
 * EXTENSIONS
 * We can extend a plugin, like the above java, witch is included in java-library
 */
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}