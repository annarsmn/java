// Write a method that takes an integer value and returns the number with
// its digits reversed. For example, given the number 7631, the method should return 1367.
// Incorporate the method into an application that reads a value from the user and displays the result.

import java.util.Scanner;

public class ReversingDigits_6_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int number = input.nextInt();
        int newNumber = reverseDigits(number);
        System.out.printf("The number %d with its digits reversed is %d", number, newNumber);
    }

    public static int reverseDigits(int num){
        int sign = 1;
        if (num < 0) {
            sign = -1;
            num = num * (-1);
        }
        int newNum = 0;
        while (num != 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum * sign;
    }
}
