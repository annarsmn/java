package Ex_10_17;

public class Building implements CarbonFootprint {
    private double area; // площадь здания в квадратных метрах
    private double gasConsumptionPer100m2 = 10; // газовое потребление на 100 м2 в термах
    private double carbonEmissionFactor = 11.7; // коэффициент углеродных выбросов для газа (в фунтах CO2 на терм)

    public Building(double area) {
        this.area = area;
    }

    @Override
    public double getCarbonFootprint() {
        double totalGasConsumption = (area / 100) * gasConsumptionPer100m2;
        return totalGasConsumption * carbonEmissionFactor;
    }

    @Override
    public String toString() {
        return "Building with area " + area + " square meters";
    }
}
