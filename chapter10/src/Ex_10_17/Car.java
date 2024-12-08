package Ex_10_17;

public class Car implements CarbonFootprint {
    private double fuelEfficiency; // эффективность автомобиля (в литрах на 100 км)
    private double milesDriven;

    public Car(double fuelEfficiency, double milesDriven) {
        this.fuelEfficiency = fuelEfficiency;
        this.milesDriven = milesDriven;
    }

    @Override
    public double getCarbonFootprint() {
        // Углеродный след зависит от топливной эффективности и количества пройденных миль
        return (milesDriven / 100) * fuelEfficiency * 2.31;
    }

    @Override
    public String toString() {
        return "Car with fuel efficiency " + fuelEfficiency + " L/100km";
    }
}