// 16.14 (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
// of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
// Es, two Ls, one O, one T and one R. Display the results.

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class CountingLetter_16_14 {
    public static void main(String[] args) {
        Map<Character, Integer> letterMap = new HashMap<>();
        createMap(letterMap);
        displayMap(letterMap);
    }

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char letter = Character.toLowerCase(c);
                if (map.containsKey(letter)) {
                    int count = map.get(letter);
                    map.put(letter, count + 1);
                } else {
                    map.put(letter, 1);
                }
            }
        }
    }

    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (char key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}