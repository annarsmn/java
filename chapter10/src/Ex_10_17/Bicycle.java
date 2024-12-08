package Ex_10_17;

public class Bicycle implements CarbonFootprint {
    private double milesRidden;

    public Bicycle(double milesRidden) {
        this.milesRidden = milesRidden;
    }

    @Override
    public double getCarbonFootprint() {
        return milesRidden * 0.01;
    }

    @Override
    public String toString() {
        return "Bicycle ridden for " + milesRidden + " miles";
    }
}