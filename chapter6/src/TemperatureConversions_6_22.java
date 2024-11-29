//Implement the following integer methods:
// a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
// calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
// b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using
// the calculation
// fahrenheit = 9.0 / 5.0 * celsius + 32;
// c) Use the methods from parts (a) and (b) to write an application that enables the user
//either to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a
// Celsius temperature and display the Fahrenheit equivalent.

import java.util.Scanner;

public class TemperatureConversions_6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int fahrenheit;
        int celsius;
        while (true) {
            System.out.print("Enter 1 to enter a Fahrenheit temperature or 2 to enter a Celsius temperature:");
            choice = input.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Wrong number. Please try again. ");
            } else {
                break;
            }
        }
        if (choice == 1) {
            System.out.print("Enter a Fahrenheit temperature: ");
            fahrenheit = input.nextInt();
            System.out.printf("The Celsius equivalent of %d fahrenheit is %d.", fahrenheit, celsius(fahrenheit));
        } else {
            System.out.print("Enter a Celsius temperature: ");
            celsius = input.nextInt();
            System.out.printf("The Fahrenheit equivalent of %d celsius is %d.", celsius, fahrenheit(celsius));
        }
        input.close();
    }

    public static int celsius(int fahrenheit) {
        double celsius = 5.0 / 9.0 * (fahrenheit - 32);
        return (int)Math.round(celsius);
    }

    public static int fahrenheit(int celsius) {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        return (int)Math.round(fahrenheit);
    }
}
