package ru.ibs.Task_One_Calculator;

import java.util.Scanner;

public class Calculator {

    /**
     * Выполняет арифметические операции с дробными числами
     *
     * @param num1   Первое число
     * @param num2   Второе число
     * @param action Операция ("+", "-", "*", "/")
     * @return Результат с округлением до 4 знаков
     */
    public static double calculate(double num1, double num2, String action) {
        double result;
        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return 0;
                }
                break;
            default:
                System.out.println("Неверная операция!");
                return 0;
        }
        return Math.round(result * 10000) / 10000.0;
    }

    /**
     * Интерфейс калькулятора
     */
    public static void calculatorInterface(Scanner scanner) {
        System.out.println("Добро пожаловать в калькулятор дробных чисел!");
        System.out.print("Введите первое дробное число: ");
        String input1 = scanner.nextLine().replace(',', '.');
        double num1 = Double.parseDouble(input1);
        System.out.print("Введите второе дробное число: ");
        String input2 = scanner.nextLine().replace(',', '.');
        double num2 = Double.parseDouble(input2);
        System.out.print("Выберите операцию (+, -, *, /): ");
        String action = scanner.next();
        double result = calculate(num1, num2, action);
        System.out.printf("Результат: %.4f%n", result);
    }
}