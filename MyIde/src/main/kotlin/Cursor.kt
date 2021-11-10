 class Cursor() {
    private val cursor : String = "|"

     fun setCursor (element : Int , text : String): String {
        for (it in 0..text.length){
            if (it == element){
                return text.substring(0, it) + cursor + text.substring(it, text.length)
            }
        }
         return ""
    }
}