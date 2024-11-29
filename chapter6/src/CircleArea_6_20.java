// Write an application that prompts the user for the radius of a circle and uses
// a method called circleArea to calculate the area of the circle.

import java.util.Scanner;

public class CircleArea_6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double circleArea;

        while (true) {
            System.out.print("Enter the radius of a circle: ");
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("The radius must be positive. Try again.");
            } else {
                break;
            }
        }
        circleArea = circleArea(radius);
        System.out.printf("The area of the circle is: %.2f\n", circleArea);
        input.close();
    }

    public static double circleArea(double radius){
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
}
