package ru.ibs.Task_One;

import java.util.Scanner;

public class Calculator {

    /**
     * Основной метод для выполнения арифметических операций с дробными числами.
     *
     * @param num1   Первое дробное число.
     * @param num2   Второе дробное число.
     * @param action Строка, указывающая тип операции ("+", "-", "*", "/").
     * @return Результат вычисления, округленный до 4 знаков после запятой.
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
        return Math.round(result * 10000) / 10000.0; // Округление до 4 знаков после запятой
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вывод приветствия и запрос данных
        System.out.println("Добро пожаловать в калькулятор дробных чисел!");

        // Ввод первого числа
        System.out.print("Введите первое дробное число: ");
        double num1 = scanner.nextDouble();

        // Ввод второго числа
        System.out.print("Введите второе дробное число: ");
        double num2 = scanner.nextDouble();

        // Выбор операции
        System.out.print("Выберите операцию (+, -, *, /): ");
        String action = scanner.next();

        // Выполнение вычислений
        double result = calculate(num1, num2, action);

        // Форматированный вывод результата
        System.out.printf("Результат: %.4f%n", result);

        scanner.close();
    }
}