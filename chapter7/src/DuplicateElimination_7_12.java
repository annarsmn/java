//Use a one-dimensional array to solve the following problem:
//Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//the complete set of unique values input after the user enters each new value.

import java.util.Scanner;

public class  DuplicateElimination_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];
        int count = 0;
        System.out.println("Enter 5 numbers in range from 10 to 100");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Not a valid number. Try again.");
                i--;
                continue;
            }

            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueNumbers[count] = number;
                count++;
            } else {
                System.out.println("The number has already been entered.");
            }

            System.out.print("Unique numbers: ");
            for (int j = 0; j < count; j++) {
                System.out.print(uniqueNumbers[j] + " ");
            }
            System.out.println();
        }
        input.close();
        System.out.println("The full array of unique numbers: ");
        for (int j = 0; j < count; j++) {
            System.out.print(uniqueNumbers[j] + " ");
        }
    }
}