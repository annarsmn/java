public class TrafficLightTest_8_10 {
    public static void main(String[] args) {
        for (TrafficLight_8_10 light : TrafficLight_8_10.values()) {
            System.out.println(light + " light duration: " + light.getDuration() + " seconds");
        }
    }
}