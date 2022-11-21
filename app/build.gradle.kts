/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    // application add functionality for packaging and running java applications
    id("my-application")    // apply a plugin with id() and gradle offers a java plugin
}