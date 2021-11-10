 class Cursor() {
    private val cursor : String = "|"
    private var position : Int = 0

     fun setCursor (element : Int , text : String): String {
        for (it in 0..text.length){
            if (it == element){
                this.position = it
                return text.substring(0, it) + cursor + text.substring(it, text.length)
            }
        }
         return ""
    }
     fun getPosition () : Int{
         return position
     }

}