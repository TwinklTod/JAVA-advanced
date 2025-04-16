package ru.ibs.Task_Four_OOP;

import java.util.Scanner;

public class CalculatorApp {
    public static void run() {

        try (Scanner scanner = new Scanner(System.in)) {
            Calculator calculator = new Calculator();
            System.out.println("Введите первое число: ");
            calculator.setOperand1(scanner.nextDouble());

            System.out.println("Введите оператор (+, -, *, /): ");
            calculator.setOperator(scanner.next().charAt(0));

            System.out.println("Введите второе число: ");
            calculator.setOperand2(scanner.nextDouble());

            double result = calculator.calculate();
            System.out.println("Результат " + result);
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}