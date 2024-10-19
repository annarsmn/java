package org.example;

//Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
//separated from one another by three spaces each.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int first_digit;
        int second_digit;
        int third_digit;
        int fourth_digit;
        int five_digit;

        System.out.print("Enter the 5-digits integer: ");
        number = input.nextInt();

        first_digit = number % 10;
        second_digit = (number / 10) % 10;
        third_digit = (number / 100) % 10;
        fourth_digit = (number / 1000) % 10;
        five_digit = number / 10000;

        System.out.printf("%d   %d   %d   %d   %d", five_digit, fourth_digit, third_digit,
                second_digit, first_digit);
    }
}