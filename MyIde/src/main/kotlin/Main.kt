fun main(args: Array<String>) {
    var ide : Ide = Ide()
    //Ide.writeToFile("Denis is supaDuppa Montazhnik")
    //println(Ide.printFile())
    ide.readFileAsTextUsingInputStream("testHTML.html")
    println(ide.getTextElement('b'))
    println(ide.printFile())
}