//Define a method hypotenuse that calculates the hypotenuse of
//a right triangle when the lengths of the other two sides are given.
//The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into a
//application that reads values for side1 and side2 and performs the calculation with the hypotenuse
//method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
//triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]

public class HypotenuseCalculations_6_15 {
    public static void main(String[] args) {
        double triangle1Side1 = 3.0;
        double triangle1Side2 = 4.0;

        double triangle2Side1 = 5.0;
        double triangle2Side2 = 12.0;

        double triangle3Side1 = 8.0;
        double triangle3Side2 = 15.0;

        System.out.printf("%-10s %-10s %-10s %-10s%n", "Triangle", "Side 1", "Side 2", "Hypotenuse");

        System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", 1, triangle1Side1, triangle1Side2, hypotenuseCalc(triangle1Side1, triangle1Side2));
        System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", 2, triangle2Side1, triangle2Side2, hypotenuseCalc(triangle2Side1, triangle2Side2));
        System.out.printf("%-10d %-10.2f %-10.2f %-10.2f%n", 3, triangle3Side1, triangle3Side2, hypotenuseCalc(triangle3Side1, triangle3Side2));
    }

    public static double hypotenuseCalc(double side1, double side2) {
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }
}
