package org.example;

//Using an approach similar to that for Exercise 4.21, find
//the two largest values of the 10 values entered.

import java.util.Scanner;

public class FindtheTwoLargestNumbers_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int theLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Enter number №%d: ", counter);
            number = input.nextInt();

            if (number > theLargest) {
                secondLargest = theLargest;
                theLargest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter += 1;
        }

        System.out.printf("The largest number is: %d\n", theLargest);
        System.out.printf("The second largest number is: %d", secondLargest);
        input.close();
    }
}
