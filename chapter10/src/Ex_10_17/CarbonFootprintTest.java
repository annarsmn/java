package Ex_10_17;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        Building building = new Building(200);
        Car car = new Car(8, 15000);
        Bicycle bicycle = new Bicycle(500);

        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();
        carbonFootprints.add(building);
        carbonFootprints.add(car);
        carbonFootprints.add(bicycle);

        for (CarbonFootprint item : carbonFootprints) {
            System.out.println(item);
            System.out.printf("Carbon footprint: %.2f%n%n", item.getCarbonFootprint());
        }
    }
}