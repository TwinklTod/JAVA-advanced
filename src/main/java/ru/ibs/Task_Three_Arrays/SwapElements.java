package ru.ibs.Task_Three_Arrays;

import java.util.Random;
import java.util.Arrays;

public class SwapElements {

    public static void Swap() {
        int[] numbers = new int[20];
        Random random = new Random();
        Integer maxNegative = null, minPositive = null;
        int maxNegIndex = -1, minPosIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(21) - 10;
            if (numbers[i] < 0 && (maxNegative == null || numbers[i] > maxNegative)) {
                maxNegative = numbers[i];
                maxNegIndex = i;
            }
            if (numbers[i] > 0 && (minPositive == null || numbers[i] < minPositive)) {
                minPositive = numbers[i];
                minPosIndex = i;
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        if (maxNegIndex != -1 && minPosIndex != -1) {
            System.out.println("Заменяем числа: " + maxNegative + " (макс. отрицательное) и " + minPositive + " (мин. положительное)");
            numbers[maxNegIndex] = minPositive;
            numbers[minPosIndex] = maxNegative;
        }
        System.out.println("Массив после замены: " + Arrays.toString(numbers));
    }
}

