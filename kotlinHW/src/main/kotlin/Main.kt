import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val complex : ComplexOperations = ComplexOperations(2f,3f)
    val complex2 : ComplexOperations = ComplexOperations(5f,-7f)
    val result = complex.complexSum(complex2)
    println("Complex Sum is-> " + result.getReal().roundToInt() + result.getImag().roundToInt() + "i")
    val result2 = complex.complexSubtraction(complex2)
    println("Complex Subtraction is-> " + result2.getReal().roundToInt() +"+"+ result2.getImag().roundToInt() + "i")
    val result3 = complex.complexMultiplication(complex2)
    println("Complex Multiplication is-> " + result3.getReal().roundToInt() +"+"+ result3.getImag().roundToInt() + "i")
    val result4 = complex.complexDivision(complex2)
    println("Complex Division is-> " + result4.getReal() +"+"+ result4.getImag() + "i")
}