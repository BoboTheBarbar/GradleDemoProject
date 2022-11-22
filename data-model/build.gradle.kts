/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    id("my-java-library")
}

dependencies {
    implementation(platform("com.example:platform"))
}