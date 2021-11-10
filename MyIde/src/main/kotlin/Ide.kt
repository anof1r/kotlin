import java.io.File
import java.io.FileWriter
import java.lang.Exception

class Ide() {
    private var text: String = ""
    private var cursor : Cursor = Cursor()

    private fun saveText(str: String) {
        this.text = str
    }

    fun getText(): String {
        return this.text
    }

    fun printFile(): String {
        return this.text
    }

    fun getTextElement(element: Char): Int {
        var tmp: Int = 0
        text.forEachIndexed() { index, it ->
            if (it == element) {
                tmp = index
                println(cursor.setCursor(tmp, text))
                return tmp
            }
        }
        return tmp
    }

    fun writeToFile(str: String) {
        try {
            var fileR = FileWriter("test.txt")
            fileR.write(str)
            fileR.close()
        } catch (ex: Exception) {
            print(ex.message)
        }
        saveText(str)
    }

    fun readFileAsTextUsingInputStream(fileName: String) =
        saveText((File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)).toString())

}