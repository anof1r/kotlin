class ComplexOperations(r: Float, i: Float) {
    private var real: Float = r
    private var imag: Float = i

    fun getReal(): Float {
        return real
    }

    fun getImag(): Float {
        return imag
    }

    fun complexSum(a: ComplexOperations): ComplexOperations {
        val newReal = real + a.getReal()
        val newImag = imag + a.getImag()
        return ComplexOperations(newReal, newImag)
    }

    fun complexSubtraction(a: ComplexOperations): ComplexOperations {
        val newReal = real - a.getReal()
        val newImag = imag - a.getImag()
        return ComplexOperations(newReal, newImag)
    }

    fun complexMultiplication(a: ComplexOperations): ComplexOperations {
        val newReal = real * a.getReal() - imag * a.getImag()
        val newImag = imag * a.getReal() + real * a.getImag()
        return ComplexOperations(newReal, newImag)
    }

    fun complexDivision(a: ComplexOperations): ComplexOperations {
        val newReal: Float = (real * a.getReal() + imag * a.getImag()) /
                (a.getReal() * a.getReal() + a.getImag() * a.getImag())
        val newImag = (imag * a.getReal() - real * a.getImag()) /
                (a.getReal() * a.getReal() + a.getImag() * a.getImag())
        return ComplexOperations(newReal, newImag)
    }
}