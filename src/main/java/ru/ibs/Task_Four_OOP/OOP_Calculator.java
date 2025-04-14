package ru.ibs.Task_Four_OOP;

import java.util.Scanner;

interface Operation {
    double calculate(double a, double b);
}

class Addition implements Operation {
    public double calculate(double a, double b) {
        return a + b;
    }
}

class Subtraction implements Operation {
    public double calculate(double a, double b) {
        return a - b;
    }
}

class Multiplication implements Operation {
    public double calculate(double a, double b) {
        return a * b;
    }
}

class Division implements Operation {
    public double calculate(double a, double b) {
        if (b == 0) throw new ArithmeticException("Деление на ноль!");
        return a / b;
    }
}

public class OOP_Calculator {
    public double execute(Operation operation, double a, double b) {
        return operation.calculate(a, b);
    }

    public static void calculatorInterface(Scanner scanner) {
        OOP_Calculator oopCalculator = new OOP_Calculator();

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Выберите операцию (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        Operation operation;
        switch (op) {
            case '+':
                operation = new Addition();
                break;
            case '-':
                operation = new Subtraction();
                break;
            case '*':
                operation = new Multiplication();
                break;
            case '/':
                operation = new Division();
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }

        try {
            double result = oopCalculator.execute(operation, num1, num2);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
