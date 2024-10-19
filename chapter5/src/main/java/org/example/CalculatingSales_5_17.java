package org.example;
import java.util.Scanner;

//An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//a) product number
//b) quantity sold
//Your program should use a switch statement to determine the retail price for each product. It
//should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//loop to determine when the program should stop looping and display the final results.

public class CalculatingSales_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalValue = 0.0;
        int productNumber;
        int quantity = 0;
        double price = 0;

        while (true) {
            System.out.println("Enter product number (1-5) or 0 to quit: ");
            productNumber = input.nextInt();

            if (productNumber == 0) {
                break;
            }

            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.print("Please enter a number between 1 and 5. Please try again.\n");
                    continue;
            }
            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            if (quantity < 0) {
                System.out.print("Quantity cannot be negative. Please try again.\n");
                continue;
            }

            totalValue += price * quantity;
        }
        System.out.printf("Total value of all products sold: $%.2f\n", totalValue);
        input.close();
    }
}
