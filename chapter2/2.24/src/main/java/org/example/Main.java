package org.example;

import java.util.Scanner;

//Write an application that reads five integers and determines
//and prints the largest and smallest integers in the group.
// Use only the programming techniques you learned in this chapter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int smallest = 0;
        int largest = 0;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 > number2) {
            largest = number1;
            smallest = number2;
        }
        if (number2 >= number1) {
            largest = number2;
            smallest = number1;
        }

        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        if (number3 > largest)
            largest = number3;
        if (number3 <= smallest)
            smallest = number3;

        System.out.print("Enter fourth integer: ");
        number4 = input.nextInt();

        if (number4 > largest)
            largest = number4;
        if (number4 <= smallest)
            smallest = number4;

        System.out.print("Enter fifth integer: ");
        number5 = input.nextInt();

        if (number5 > largest)
            largest = number5;
        if (number5 <= smallest)
            smallest = number5;

        System.out.printf("The smallest is: %d%n", smallest);
        System.out.printf("The largest is: %d%n", largest);
    }
}