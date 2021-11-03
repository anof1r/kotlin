import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val complex : Complex = Complex(2f,3f)
    val complex2 : Complex = Complex(5f,-7f)
    val result = complex.add(complex2)
    println("Complex Sum is-> " + result.getReal().roundToInt() + result.getImag().roundToInt() + "i")
    val result2 = complex.subtract(complex2)
    println("Complex Subtraction is-> " + result2.getReal().roundToInt() +"+"+ result2.getImag().roundToInt() + "i")
    val result3 = complex.multiply(complex2)
    println("Complex Multiplication is-> " + result3.getReal().roundToInt() +"+"+ result3.getImag().roundToInt() + "i")
    val result4 = complex.divide(complex2)
    println("Complex Division is-> " + result4.getReal() +"+"+ result4.getImag() + "i")
    val result5 = complex.power(5)
    println("Complex power is-> " + result5.getReal() + result5.getImag() + "i")
}