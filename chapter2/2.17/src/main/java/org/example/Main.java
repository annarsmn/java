package org.example;

//Write an application that inputs three integers from the user and displays
//the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result
// in an integer representation of the average. So, if the sum of the values is 7, the average
// should be 2, not 2.3333….]

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int smallest = 0;
        int largest = 0;
        int sum;
        int average;
        int product;

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

        if (number3 >= largest)
            largest = number3;
        if (number3 <= smallest)
            smallest = number3;

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = sum / 3;

        System.out.printf("The sum is: %d%n", sum);
        System.out.printf("The product is: %d%n", product);
        System.out.printf("The average is: %d%n", average);
        System.out.printf("The smallest is: %d%n", smallest);
        System.out.printf("The largest is: %d%n", largest);
    }
}