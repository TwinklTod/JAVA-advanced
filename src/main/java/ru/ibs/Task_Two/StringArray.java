package ru.ibs.Task_Two;

import java.util.Scanner;

public class StringArray {

    /**
     * Находит самое длинное слово в массиве
     *
     * @param words Массив слов
     * @return Самое длинное слово или сообщение об ошибке
     */
    public static String findMaxWord(String[] words) {
        if (words == null || words.length == 0) {
            return "Массив пуст";
        }
        String max = words[0];
        for (String word : words) {
            if (word != null && word.length() > max.length()) {
                max = word;
            }
        }
        return max;
    }

    /**
     * Интерфейс для работы с массивом слов
     */
    public static void findMaxInterface(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Сброс буфера

        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        String maxWord = findMaxWord(words);
        System.out.println("Самое длинное слово: " + maxWord);
    }
}
