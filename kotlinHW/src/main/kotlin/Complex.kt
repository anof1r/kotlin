import kotlin.math.pow

class Complex(r: Float, i: Float) {
    private var real: Float = r
    private var imag: Float = i

    fun getReal(): Float {
        return real
    }

    fun getImag(): Float {
        return imag
    }

    fun add(a: Complex): Complex {
        val newReal = real + a.getReal()
        val newImag = imag + a.getImag()
        return Complex(newReal, newImag)
    }

    fun subtract(a: Complex): Complex {
        val newReal = real - a.getReal()
        val newImag = imag - a.getImag()
        return Complex(newReal, newImag)
    }

    fun multiply(a: Complex): Complex {
        val newReal = real * a.getReal() - imag * a.getImag()
        val newImag = imag * a.getReal() + real * a.getImag()
        return Complex(newReal, newImag)
    }

    fun divide(a: Complex): Complex {
        val newReal: Float = (real * a.getReal() + imag * a.getImag()) /
                (a.getReal() * a.getReal() + a.getImag() * a.getImag())
        val newImag = (imag * a.getReal() - real * a.getImag()) /
                (a.getReal() * a.getReal() + a.getImag() * a.getImag())
        return Complex(newReal, newImag)
    }

    fun power(value: Int): Complex {
        var newReal: Float = 0f
        var newImag: Float = 0f

        for (i in 0..value) {
            var term = real.pow(value - i) * imag.pow(i) *
                    (factorial(value).toFloat() / (factorial(i) * factorial(value - i)))
            if (i > 1 && isPowerToSub(i)){
                term *= -1
            }
            if (i % 2 == 0) {
                newReal += term
            } else {
                newImag += term
            }
        }
        return Complex(newReal,newImag)
    }

    fun factorial(number: Int): Int {
        var factorial: Int = 1
        for (i in 1..number) {
            factorial *= i
        }
        return factorial
    }

    fun isPowerToSub(number : Int) : Boolean{
        var sequenceMember : Int = 2
        while (number <= sequenceMember + 1){
            if (number == sequenceMember || number == sequenceMember + 1){
                return true
            }
            sequenceMember += 4
        }
        return false
    }
}