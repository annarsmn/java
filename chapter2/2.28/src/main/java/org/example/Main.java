package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int radius;

        System.out.print("Enter the radius of the circle: ");
        radius = input.nextInt();

        System.out.printf("Diameter is %f%n", 2.0 * radius);
        System.out.printf("Circumference is %f%n", 2.0 * Math.PI * radius);
        System.out.printf("Area is %f", Math.PI * radius * radius);
    }
}