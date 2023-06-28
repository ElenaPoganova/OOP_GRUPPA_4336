package COMPLEX;

public class ComplexNumber {
    private double real;  /* вещественная часть комплексного числа */
    private double imaginary;   /* мнимая часть комплексного числа */

    //  комплексное число 
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    /* сложение комплексных чисел */
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

   /* умножение комплексных чисел */
    public ComplexNumber multiply(ComplexNumber other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(productReal, productImaginary);
    }

    /* деление комплексных чисел */
    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double quotientReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double quotientImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new ComplexNumber(quotientReal, quotientImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}    

