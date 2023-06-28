package CALCULATOR;

import COMPLEX.ComplexNumber;
import LOGGER.Logger;

public class ComplexCalculator implements Calculator {
    private Logger logger;

    /**
     * Создает экземпляр калькулятора комплексных чисел с логгером
     
     Логгер для записи операций калькулятора
     */
    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        logger.log("Результат сложения: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        logger.log("Результат умножения: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        logger.log("Результат деления: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
    
}
