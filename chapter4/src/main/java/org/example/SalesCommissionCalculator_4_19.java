package org.example;
import java.util.Scanner;

//A large company pays its salespeople on a commission basis.
//The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//these items are as follows:
//Item Value
//1 239.99
//2 129.75
//3 99.95
//4 350.89
//Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//displays that salesperson’s earnings. There’s no limit to the number of items that can be sold

public class SalesCommissionCalculator_4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double item1Price = 239.99;
        double item2Price = 129.75;
        double item3Price = 99.95;
        double item4Price = 350.89;

        int item1Sold;
        int item2Sold;
        int item3Sold;
        int item4Sold;

        double totalSales;
        double earnings;

        System.out.print("Enter the number of item 1 sold: ");
        item1Sold = input.nextInt();
        System.out.print("Enter the number of item 2 sold: ");
        item2Sold = input.nextInt();
        System.out.print("Enter the number of item 3 sold: ");
        item3Sold = input.nextInt();
        System.out.print("Enter the number of item 4 sold: ");
        item4Sold = input.nextInt();

        totalSales = item1Sold * item1Price + item2Sold * item2Price +
                     item3Sold * item3Price + item4Sold * item4Price;

        earnings = 200 + 0.09 * totalSales;

        System.out.printf("Earnings for the week: %.2f", earnings);

        input.close();
    }
}
