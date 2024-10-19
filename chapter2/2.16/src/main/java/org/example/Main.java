package org.example;
//Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number
//followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal".

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("The numbers are equal");

        if (number1 > number2)
            System.out.printf("%d is larger", number1);

        if (number1 < number2)
            System.out.printf("%d is larger", number2);
    }
}