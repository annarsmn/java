package org.example;
import java.util.Scanner;

//Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful.
//Develop a Java application that will input the miles driven and gallons used (both as integers)
//for each trip. The program should calculate and display the miles per gallon obtained for each trip
//and print the combined miles per gallon obtained for all trips up to this point.
//All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled
//repetition to obtain the data from the user.

public class GasMileage_4_17 {
    public static void main(String[] args) {
        int miles;
        int gallons;
        int combinedGallons = 0;
        int combinedMiles = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter miles or -1 to quit");
            miles = input.nextInt();
            if (miles == -1)
                break;
            if (miles <= 0){
                System.out.printf("Miles cannot be 0 or negative. Try again\n");
                continue;
            }

            System.out.println("Enter gallons used");
            gallons = input.nextInt();
            if (gallons <= 0){
                System.out.printf("Gallons cannot be 0 or negative. Try again\n");
                continue;
            }

            System.out.printf("Miles per gallon obtained for this trip: %.2f\n", (double)miles/gallons);
            combinedMiles += miles;
            combinedGallons += gallons;
            System.out.printf("Combined miles per gallon obtained for all trips up to this point: %.2f\n", (double)combinedMiles/combinedGallons);
        }
        input.close();
    }
}