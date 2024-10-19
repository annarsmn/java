package org.example;
import java.util.Scanner;

//) Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should
// display the message "Credit limit exceeded"

public class CreditLimitCalculator_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int newBalance;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;

        while (true) {
            System.out.println("Enter account number (-1 to quit):");
            int accountNumber = input.nextInt();
            if (accountNumber == -1) {
                break;
            }

            System.out.println("Enter balance at the beginning of the month:");
            beginningBalance = input.nextInt();

            System.out.println("Enter total charges this month:");
            totalCharges = input.nextInt();

            System.out.println("Enter total credits this month:");
            totalCredits = input.nextInt();

            System.out.println("Enter allowed credit limit for the month:");
            creditLimit = input.nextInt();

            newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("New balance for account %d: %d\n", accountNumber, newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Credit limit is within the allowed range.");
            }
        }
        input.close();
    }
}