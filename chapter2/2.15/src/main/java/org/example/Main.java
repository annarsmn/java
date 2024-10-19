package org.example;
import java.util.Scanner;

//Write an application that asks the user to enter two integers, obtains them
//from the user and prints their sum, product, difference and quotient (division).

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        double division;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = (double) number1 / number2;

        System.out.printf("The sum is: %d%n", sum);
        System.out.printf("The product is: %d%n", product);
        System.out.printf("The difference is: %d%n", difference);
        System.out.printf("The division is: %.2f%n", division);
    }
}