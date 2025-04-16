package ru.ibs.Task_FIve_WordStats;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordStatistics {
    private final Map<String, Integer> wordCounts = new HashMap<>();

    public void loadFromFile(String filePath) throws IOException {
        String content = Files.readString(Paths.get(filePath));
        String[] words = content.toLowerCase().split("\\s+");
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    public List<String> getSortedWords() {
        List<String> sorted = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sorted);
        return sorted;
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }

    public String getMostFrequenWord() {
        return Collections.max(wordCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public int getFrequencyOfMostFrequencyWord() {
        return wordCounts.get(getMostFrequenWord());
    }
}
