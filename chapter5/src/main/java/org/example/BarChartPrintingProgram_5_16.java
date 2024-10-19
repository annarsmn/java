package org.example;

// One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks.
// For example, if your program reads the number 7, it should display *******.
// Display the bars of asterisks after you read all five numbers

import java.util.Scanner;

public class BarChartPrintingProgram_5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;

        while (number1 < 1 || number1 > 30) {
            System.out.print("Enter number 1 (between 1 and 30): ");
            number1 = input.nextInt();
        }

        while (number2 < 1 || number2 > 30) {
            System.out.print("Enter number 2 (between 1 and 30): ");
            number2 = input.nextInt();
        }

        while (number3 < 1 || number3 > 30) {
            System.out.print("Enter number 2 (between 1 and 30): ");
            number3 = input.nextInt();
        }

        while (number4 < 1 || number4 > 30) {
            System.out.print("Enter number 4 (between 1 and 30): ");
            number4 = input.nextInt();
        }

        while (number5 < 1 || number5 > 30) {
            System.out.print("Enter number 5 (between 1 and 30): ");
            number5 = input.nextInt();
        }

        for (int i = 0; i < number1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < number2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < number3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < number4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < number5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
