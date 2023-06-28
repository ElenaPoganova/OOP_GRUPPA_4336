package CALCULATOR;

import COMPLEX.ComplexNumber;

/* интерфейс калькулятора комплексных чисел */
public interface Calculator {
    
    //  Сложение комплексных чисел num1 и num2
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    // Умножение комплексных чисел
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    
    //  Деление комплексных чисел
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);  
    
}
