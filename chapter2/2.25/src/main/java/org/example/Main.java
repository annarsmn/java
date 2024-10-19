package org.example;

import java.util.Scanner;

//Write an application that reads an integer and determines and prints whether it’s odd or even.
//[Hint: Use the remainder operator. An even number is a multiple of 2.
//Any multiple of 2 leaves a remainder of 0 when divided by 2.]

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter an integer: ");
        number = input.nextInt();

        if (number < 0)
            number = number*(-1);

        if (number % 2 == 0)
            System.out.printf("The number is even");
        if (number % 2 == 1)
            System.out.printf("The number is odd");
    }
}