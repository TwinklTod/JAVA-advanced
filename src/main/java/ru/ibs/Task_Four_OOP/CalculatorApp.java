package ru.ibs.Task_Four_OOP;

import java.util.InputMismatchException;
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
        } catch (ArithmeticException e) { // Добавление Exception для задания №6
            System.out.println("Ошибка вычисления: " + e.getMessage());
        } catch (IllegalArgumentException e) { // Добавление Exception для задания №6
            System.out.println("Ошибка ввода операции: " + e.getMessage());
        } catch (InputMismatchException e) { // Добавление Exception для задания №6
            System.out.println("Ошибка: введено не число");
        } catch (Exception e) { // Добавление Exception для задания №6
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}