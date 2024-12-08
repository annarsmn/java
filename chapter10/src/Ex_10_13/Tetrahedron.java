package Ex_10_13;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3) / (6 * Math.sqrt(2));
    }

    @Override
    public String getDescription() {
        return "Tetrahedron with side " + side;
    }
}
