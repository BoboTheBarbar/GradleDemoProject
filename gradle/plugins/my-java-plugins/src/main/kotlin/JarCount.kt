import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.nio.file.Files
import java.util.Collections.singleton

abstract class JarCount : DefaultTask() {

    @get:InputFiles
    abstract val allJars: ConfigurableFileCollection

    @get:OutputFile
    abstract val countFile: RegularFileProperty

    @TaskAction
    fun doCount() {
        val files = allJars.files
        val count : Int = files.size
        val out = countFile.get().asFile
        Files.write(out.toPath(), singleton("" + count))
    }
}