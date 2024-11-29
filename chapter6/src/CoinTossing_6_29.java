// Write an application that simulates coin tossing. Let the program toss a coin
// each time the user chooses the “Toss Coin” menu option. Count the number of times each side of
// the coin appears. Display the results. The program should call a separate method flip that takes no
// arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
// simulates coin tossing, each side of the coin should appear approximately half the time.]

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinTossing_6_29 {
    public enum Coin {HEADS, TAILS};
    private static int headsCount = 0;
    private static int tailsCount = 0;
    public static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.print("Enter 1 to choose the \"Toss Coin\" menu option and 2 to quit. ");
            choice = input.nextInt();
            if (choice == 2) {
                break;
            } else if (choice != 1) {
                System.out.println("Wrong number. Please try again.");
            } else {
                Coin result = flip();
                System.out.println("The result of tossing the coin is " + result);
                if (result == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            }
        }
        System.out.println("The results are: heads " + headsCount + " and tails " + tailsCount);
        input.close();
    }

    public static Coin flip(){
        int randomIndex = randomNumbers.nextInt(2);
        if (randomIndex == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }

    }
}
