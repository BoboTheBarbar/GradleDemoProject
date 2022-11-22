/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    id("my-java-library")    // apply a plugin with id() and gradle-core offers a java plugin
}

dependencies {
    implementation(platform("com.example:platform"))

    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
}