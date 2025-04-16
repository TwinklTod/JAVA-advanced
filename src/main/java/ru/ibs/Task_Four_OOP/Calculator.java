package ru.ibs.Task_Four_OOP;

public class Calculator {
    private double operand1;
    private double operand2;
    private char operator;

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate() {
        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> {
                if (operand2 == 0) {
                    throw new ArithmeticException("Деление на ноль запрещено");
                }
                yield operand1 / operand2;
            }
            default -> throw new IllegalArgumentException("Недопустимая операция " + operator);
        };
    }

}
