import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile

abstract class JarCount : DefaultTask() {

    @get:InputFiles
    abstract val allJars: ConfigurableFileCollection

    @get:OutputFile
    abstract val countFile: RegularFileProperty
}