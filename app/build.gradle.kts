/** Opening a project, the clean way.
 * Gradle plugins give meaning to the subprojects
 */
plugins {
    // application add functionality for packaging and running java applications
    id("my-application")
}

application {
    mainClass.set("com.example.MyApplication")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}