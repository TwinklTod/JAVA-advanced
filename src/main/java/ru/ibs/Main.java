package ru.ibs;

import ru.ibs.Task_Four_OOP.CalculatorApp;
import ru.ibs.Task_One_Calculator.Calculator;
import ru.ibs.Task_Two_StringArray.StringArray;
import ru.ibs.Task_Three_Arrays.SwapElements;
import ru.ibs.Task_Three_Arrays.SweetGift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите: (1 - Калькулятор, 2 - Поиск максимального элемента, 3 - Смена элементов массива, 4 - Сладкий подарок, 5 - Калькулятор ООП)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Сброс буфера после выбора задания

        switch (choice) {
            case 1:
                Calculator.calculatorInterface(scanner);
                break;
            case 2:
                StringArray.findMaxInterface(scanner);
                break;
            case 3:
                SwapElements.Swap();
                break;
            case 4:
                SweetGift sweetGift = new SweetGift();
                sweetGift.displayGift();
                break;
            case 5:
                CalculatorApp.run();
                break;
            default:
                System.out.println("Неверный выбор");
        }
        scanner.close();
    }
}
