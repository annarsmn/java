//Write an application that reads an English-language phrase and encodes it into Morse code.
// Also write an application that reads a phrase in Morse code and converts it into the English-lan
//guage equivalent. Use one blank between each Morse-coded letter and three blanks between each
// Morse-coded word.

import java.util.Scanner;

public class MorseCode_14_22 {
    private static final char[] letters = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final String[] morseLetters = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
    };
    private static final char[] digits = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };
    private static final String[] morseDigits = {
            "-----", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----."
    };

    public static String textToMorse(String text) {
        StringBuilder morse = new StringBuilder();
        for (char ch : text.toUpperCase().toCharArray()) {
            if (ch == ' ') {
                morse.append("   ");
            } else {
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == ch) {
                        morse.append(morseLetters[i]).append(" ");
                        break;
                    }
                }
                for (int i = 0; i < digits.length; i++) {
                    if (digits[i] == ch) {
                        morse.append(morseDigits[i]).append(" ");
                        break;
                    }
                }
            }
        }
        return morse.toString().trim();
    }

    public static String morseToText(String morse) {
        StringBuilder text = new StringBuilder();
        String[] words = morse.split("   ");
        for (String word : words) {
            String[] morseLettersToText = word.split(" ");
            for (String letter : morseLettersToText) {
                for (int i = 0; i < morseLetters.length; i++) {
                    if (morseLetters[i].equals(letter)) {
                        text.append(letters[i]);
                        break;
                    }
                }
                for (int i = 0; i < morseDigits.length; i++) {
                    if (morseDigits[i].equals(letter)) {
                        text.append(digits[i]);
                        break;
                    }
                }
            }
            text.append(" ");
        }
        return text.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Encode text to Morse code");
        System.out.println("2. Decode Morse code to text");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter text to encode:");
                String text = input.nextLine();
                System.out.println("Encoded Morse code:");
                System.out.println(textToMorse(text));
                break;
            case 2:
                System.out.println("Enter Morse code to decode:");
                String morse = input.nextLine();
                System.out.println("Decoded text:");
                System.out.println(morseToText(morse));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        input.close();
    }
}
