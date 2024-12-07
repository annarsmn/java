//Create a class Rectangle with attributes length and width, each of which
//defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
//methods for both length and width. The set methods should verify that length and width are each
//floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.

public class RectangleTest_8_4 {
    public static void main(String[] args) {
        Rectangle_8_4 rectangle = new Rectangle_8_4();
        System.out.printf("Default length: %.2f%n", rectangle.getLength());
        System.out.printf("Default width: %.2f%n", rectangle.getWidth());
        System.out.printf("Default perimeter: %.2f%n", rectangle.calculatePerimeter());
        System.out.printf("Default area: %.2f%n%n", rectangle.calculateArea());

        rectangle.setLength(5.5);
        rectangle.setWidth(10.2);
        System.out.printf("Updated length: %.2f%n", rectangle.getLength());
        System.out.printf("Updated width: %.2f%n", rectangle.getWidth());
        System.out.printf("Updated perimeter: %.2f%n", rectangle.calculatePerimeter());
        System.out.printf("Updated area: %.2f%n%n", rectangle.calculateArea());

        try {
            rectangle.setLength(25.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            rectangle.setWidth(-3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
