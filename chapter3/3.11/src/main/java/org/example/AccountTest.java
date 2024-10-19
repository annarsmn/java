package org.example;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdraw1Amount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from account1 balance%n%n", withdraw1Amount);
        account1.withdraw(withdraw1Amount);

        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account2: ");
        double withdraw2Amount = input.nextDouble();
        System.out.printf("%nWithdrawing %.2f from account2 balance%n%n", withdraw2Amount);
        account2.withdraw(withdraw2Amount);

        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
