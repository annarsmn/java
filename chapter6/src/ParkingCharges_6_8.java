///A parking garage charges a $2.00 minimum fee to park for up to three
//hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//customer. The program should display the charge for the current customer and should calculate and
//display the running total of yesterday’s receipts. It should use the method calculateCharges
// to determine the charge for each customer.

import java.util.Scanner;

public class ParkingCharges_6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.println("Enter the number of customers: ");
        int numberOfCustomers = input.nextInt();

        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.printf("Enter the number of hours for customer №%d:", i+1);
            double hoursParked = input.nextDouble();
            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;
            System.out.printf("The charge for customer №%d: %.2f%n", i+1, charge);
        }

        System.out.printf("Total of charges: %.2f", totalReceipts);
        input.close();
    }

    public static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3) {
            charge += Math.ceil(hours-3) * 0.5;
        }
        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }
}