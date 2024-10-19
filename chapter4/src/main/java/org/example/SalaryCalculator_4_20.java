package org.example;

//Develop a Java application that determines the gross pay for each of
//three employees. The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//number of hours worked last week and their hourly rates. Your program should input this information
//for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//input the data.

import java.util.Scanner;

public class SalaryCalculator_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int hours;
        int hourlyRate;
        double pay;

        while (number <= 3) {
            System.out.printf("Enter number of hours worked last week for employee №%d: ", number);
            hours = input.nextInt();
            if (hours < 0) {
                System.out.print("Number of hours cannot ba negative. Try again\n");
                continue;
            }

            System.out.printf("Enter hourly rate for employee №%d: ", number);
            hourlyRate = input.nextInt();
            if (hourlyRate < 0) {
                System.out.print("Hourly rate cannot ba negative. Try again\n");
                continue;
            }

            if (hours <= 40) {
                pay = hours*hourlyRate;
            } else {
                pay = 40 * hourlyRate + (hours - 40) * hourlyRate * 1.5;
            }
            System.out.printf("Gross pay for employee №%d is: %.2f\n", number, pay);
            number += 1;
        }
        input.close();
    }
}
