package ru.ibs;

import ru.ibs.Task_One.Calculator;
import ru.ibs.Task_Two.StringArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите: (1 - Калькулятор, 2 - Поиск максимального элемента)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Сброс буфера после выбора задания

        switch (choice) {
            case 1:
                Calculator.calculatorInterface(scanner);
                break;
            case 2:
                StringArray.findMaxInterface(scanner);
                break;
            default:
                System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}
