package ru.ibs.Task_FIve_WordStats;

import java.io.IOException;
import java.util.List;

public class WordStatsApp {
    public static void run(String filePath) {
        WordStatistics stats = new WordStatistics();

        try {
            stats.loadFromFile(filePath);

            System.out.println("Слова в алфавитном порядке");
            List<String> sortedWords = stats.getSortedWords();
            for (String word : sortedWords) {
                System.out.println(word + ": " + stats.getWordCounts().get(word));
            }
            String mostFrequent = stats.getMostFrequenWord();
            int frequency = stats.getFrequencyOfMostFrequencyWord();
            System.out.println("\nСамое частое слово: " + mostFrequent + " (" + frequency + " раз");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
