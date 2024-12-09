// Write an application that inputs a line of text and a search character and
// uses String method indexOf to determine the number of occurrences of the character in the text.

import java.util.Scanner;

public class SearchingStrings_14_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of text: ");
        String text = input.nextLine();

        System.out.println("Enter the search character: ");
        char searchChar = input.next().charAt(0);

        int occurences = countOccurences(text, searchChar);
        System.out.println("The character " + searchChar + " occurs " + occurences + " times in the text");

        input.close();
    }

    public static int countOccurences(String text, char searchChar){
        int count = 0;
        int index = text.indexOf(searchChar);

        while (index != -1) {
            count++;
            index = text.indexOf(searchChar, index +1 );
        }

        return count;
    }
}
