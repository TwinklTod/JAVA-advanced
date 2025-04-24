package ru.ibs.Task_Five_UnitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ibs.Task_Four_OOP.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(5);
        calculator.setOperator('+');
        Assertions.assertEquals(15, calculator.calculate(), 0.0001);
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(5);
        calculator.setOperator('-');
        Assertions.assertEquals(5, calculator.calculate(), 0.0001);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(5);
        calculator.setOperator('*');
        Assertions.assertEquals(50, calculator.calculate(), 0.0001);
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(5);
        calculator.setOperator('/');
        Assertions.assertEquals(2, calculator.calculate(), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(0);
        calculator.setOperator('/');
        assertThrows(ArithmeticException.class, calculator::calculate);
    }

    @Test
    void testInvalidOperator() {
        Calculator calculator = new Calculator();
        calculator.setOperand1(10);
        calculator.setOperand2(5);
        calculator.setOperator('%');
        assertThrows(IllegalArgumentException.class, calculator::calculate);
    }
}
