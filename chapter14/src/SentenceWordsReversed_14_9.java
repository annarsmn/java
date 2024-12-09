//Write an application that inputs a line of
// text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
// characters as delimiters.

import java.util.Scanner;

public class SentenceWordsReversed_14_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        String reversedSentence = reverseWords(sentence);

        System.out.println("Reversed sentence:\n" + reversedSentence);
        input.close();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
