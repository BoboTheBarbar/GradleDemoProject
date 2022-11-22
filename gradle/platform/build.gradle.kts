plugins {
    id("java-platform") // Setting up the platform configuration - Similar to BOM == Bill of Material
}

group = "com.example"

javaPlatform.allowDependencies()    // By default, a plattform would not allow dependency declaration
dependencies {
    api(platform("com.fasterxml.jackson:jackson-bom:2.13.3"))   // Sometimes a dep. has a platform and the implementation.
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")
}