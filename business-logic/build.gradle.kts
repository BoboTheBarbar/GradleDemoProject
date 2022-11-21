/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    id("my-java-library")    // apply a plugin with id() and gradle-core offers a java plugin
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
}