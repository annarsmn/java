//(Printing Dates in Various Formats) Dates are printed in several common formats. Two of
// the more common formats are
// 04/25/1955 and April 25, 1955
// Write an application that reads a date in the first format and prints it in the second format

import java.util.Scanner;

public class PrintingDates_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a date in the format MM/DD/YYYY: ");
        String date = input.nextLine();
        String[] dateParts = date.split("/");

        if (dateParts.length != 3) {
            System.out.println("Invalid date format.");
            return;
        }

        String monthStr = dateParts[0];
        String dayStr = dateParts[1];
        String yearStr = dateParts[2];

        if (!isNumeric(monthStr) || !isNumeric(dayStr) || !isNumeric(yearStr)) {
            System.out.println("Invalid date. Month, day, and year must be numeric.");
            return;
        }

        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        String monthName = getMonthName(month);
        if (monthName == null || !isValidDay(month, day, year)) {
            System.out.println("Invalid date entered.");
            return;
        }

        System.out.println(monthName + " " + day + ", " + year);
        input.close();
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null;
        }
    }

    private static boolean isValidDay(int month, int day, int year) {
        if (day < 1) {
            return false;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return day <= 31;
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                if (isLeapYear(year)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            default:
                return false;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
