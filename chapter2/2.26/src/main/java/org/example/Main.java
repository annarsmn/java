package org.example;

//Write an application that reads two integers, determines whether the first is a
//multiple of the second and prints the result.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = input.nextInt();
        if (number2 == 0)
            System.out.printf("The second number cannot be zero");
        else {
        if (number1 % number2 == 0)
            System.out.printf("The first is a multiple of the second");
        if (number1 % number2 != 0)
            System.out.printf("The first is not a multiple of the second");
        }
    }
}