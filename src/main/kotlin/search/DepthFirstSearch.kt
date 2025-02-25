package search

import grokkingalgorithms.listFiles
import java.io.File

fun dFSListFiles(directory: File) {
    if (directory.isDirectory) {
        directory.listFiles()?.forEach { file ->
            if (file.isDirectory) {
                println("Directory: ${file.name}")
                listFiles(file)
            } else {
                println("File: ${file.name}")
            }
        }
    } else {
        println("${directory.name} is not a directory")
    }
}

fun main() {
    val rootDirectory = File("/home/stekl0/Main")
    dFSListFiles(rootDirectory)
}
