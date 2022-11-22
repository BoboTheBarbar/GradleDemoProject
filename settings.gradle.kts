/**
 * Declaring locations for other Repositories. This is not executing anything, just used for discovery.
 */
dependencyResolutionManagement {
    repositories.mavenCentral()
    //    repositories.google()
    //    repositories.maven("https://mylocation/repo") {
    //        credentials.username = "..."
    //        credentials.password = "..."
    //    }

    // Tell gradle, that there is another project that would need to be build. We only inform about locations here.
    //    includeBuild("../my-other-project")
    includeBuild("gradle/platform")
}

/**
 * Same as the dependencyResolutionManagement, this is used to discover gradle plugins, to implement or extend the gradle api
 */
pluginManagement {
    repositories.gradlePluginPortal()
    //    repositories.mavenCentral()
    //    repositories.google()
    //    repositories.maven("https://mylocation/repo") {
    //        credentials.username = "..."
    //        credentials.password = "..."
    //    }

    includeBuild("gradle/plugins")
}

/**
 * Optionally, we can set a project name here. If not provided, it will be derived from the folder name
 */
rootProject.name = "my-project"

/**
 * Syncing this configuration with intellij, will enable intellij to understand the folder structure as component folders (modules).
 * Details about them, will be configured in the build file.
  */
include("app")
include("business-logic")
include("data-model")