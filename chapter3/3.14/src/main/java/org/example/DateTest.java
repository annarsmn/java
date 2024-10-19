package org.example;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(9,21, 2024);
        System.out.print("Date: ");
        date.displayDate();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter new month: ");
        int newMonth = input.nextInt();
        date.setMonth(newMonth);

        System.out.print("Enter new day: ");
        int newDay = input.nextInt();
        date.setDay(newDay);

        System.out.print("Enter new year: ");
        int newYear = input.nextInt();
        date.setYear(newYear);

        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
