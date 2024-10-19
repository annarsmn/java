package org.example;

//Write a program that inputs five numbers and determines and prints the number of negative numbers input, the number of positive numbers input and
//the number of zeros input.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int positive = 0;
        int negative = 0;
        int zeroes = 0;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        number4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        number5 = input.nextInt();

        if (number1 > 0)
            positive +=1;
        if (number1 < 0)
            negative +=1;
        if (number1 == 0)
            zeroes +=1;

        if (number2 > 0)
            positive +=1;
        if (number2 < 0)
            negative +=1;
        if (number2 == 0)
            zeroes +=1;

        if (number3 > 0)
            positive +=1;
        if (number3 < 0)
            negative +=1;
        if (number3 == 0)
            zeroes +=1;

        if (number4 > 0)
            positive +=1;
        if (number4 < 0)
            negative +=1;
        if (number4 == 0)
            zeroes +=1;

        if (number5 > 0)
            positive +=1;
        if (number5 < 0)
            negative +=1;
        if (number5 == 0)
            zeroes +=1;

        System.out.printf("The number of positives numbers is: %d, the number of negative numbers is: %d, the number of zeroes is: %d%n", positive, negative, zeroes);
    }
}