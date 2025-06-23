package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter{

    /**
     * Kotlin에서는 Checked Exception과
     * Uchecked Exception을 구분하지 않습니다.
     */
    fun readFile(){
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /**
     * try-with-resources
     * "use" keyword
     */
    fun readFileV2(path: String){
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}