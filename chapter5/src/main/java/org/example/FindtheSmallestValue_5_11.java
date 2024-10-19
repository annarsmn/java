package org.example;
import java.util.Scanner;

//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.

public class FindtheSmallestValue_5_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfValues;
        int number;
        int smallest = Integer.MAX_VALUE;

        System.out.printf("Enter the number of values: ");
        numberOfValues = input.nextInt();

        for (int i = 0; i < numberOfValues; i++) {
            System.out.printf("Enter the value №%d: ", i+1);
            number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.printf("The smallest number is: %d", smallest);
        input.close();
    }
}