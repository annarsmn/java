// (Counting Duplicate Words) Write a program that determines and prints the number of
// duplicate words in a sentence. Treat uppercase and lowercase letters the same. Ignore punctuation

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class CountingDuplicateWords_16_16 {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();
        createMap(wordMap);
        displayDuplicateWords(wordMap);
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                if (map.containsKey(word)) {
                    int count = map.get(word);
                    map.put(word, count + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }
    }

    private static void displayDuplicateWords(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        System.out.printf("%nDuplicate words:%nWord\t\tCount%n");

        for (String key : keys) {
            int count = map.get(key);
            if (count > 1) {
                System.out.printf("%-10s%7d%n", key, count);
            }
        }
    }
}