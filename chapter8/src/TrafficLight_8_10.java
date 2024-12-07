public enum TrafficLight_8_10 {
    RED(60),
    GREEN(90),
    YELLOW(30);

    private final int duration;

    TrafficLight_8_10(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}