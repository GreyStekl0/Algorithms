package grokkingalgorithms

import java.io.File
import java.util.LinkedList
import java.util.Queue

fun listFiles(directory: File) {
    val queue: Queue<File> = LinkedList()
    queue.add(directory)

    while (queue.isNotEmpty()) {
        val current = queue.poll()
        if (current.isDirectory) {
            current.listFiles()?.forEach { file ->
                if (file.isDirectory) {
                    println("Directory: ${file.name}")
                    queue.add(file)
                } else {
                    println("File: ${file.name}")
                }
            }
        } else {
            println("${current.name} is not a directory")
        }
    }
}

fun main() {
    val rootDirectory = File("/home/stekl0/Main")
    listFiles(rootDirectory)
}
