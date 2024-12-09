//Write an application that reads a line of text, tokenizes it
//using space characters as delimiters and outputs only those words ending with the letters "ED".

import java.util.Scanner;

public class ComparingStrings_14_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String text = input.nextLine();

        String[] words = text.split("\\s+");

        System.out.println("Words that end with 'ED': ");

        for (String word: words) {
            if (word.length() >= 2 && word.substring(word.length()-2).equalsIgnoreCase("ED")) {
                System.out.println(word);
            }
        }

        input.close();
    }
}