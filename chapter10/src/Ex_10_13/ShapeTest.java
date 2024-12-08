package Ex_10_13;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(3),
                new Square(4),
                new Triangle(3, 4, 5),
                new Sphere(5),
                new Cube(3),
                new Tetrahedron(2)
        };

        for (Shape shape : shapes) {
            System.out.println("Shape type: " + shape.getClass().getSimpleName());
            System.out.println(shape.getDescription());
            System.out.printf("Surface Area: %.2f%n", shape.getArea());
            if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.printf("Volume: %.2f%n", threeDShape.getVolume());
            }
            System.out.println();
        }
    }
}
