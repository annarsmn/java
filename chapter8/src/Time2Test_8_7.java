public class Time2Test_8_7 {
    public static void main(String[] args) {
        Time2_8_7 time = new Time2_8_7(23, 59, 59);
        System.out.println("Initial time: " + time.toUniversalString());
        time.tick();
        System.out.println("After tick to the next day: " + time.toUniversalString());

        time.setTime(8, 59, 59);
        System.out.println("Initial time: " + time.toUniversalString());
        time.tick();
        System.out.println("After tick to next hour: " + time.toUniversalString());

        time.setTime(8, 59, 1);
        System.out.println("Initial time: " + time.toUniversalString());
        time.tick();
        System.out.println("After tick: " + time.toUniversalString());

        time.setTime(1, 59, 30);
        System.out.println("Initial time: " + time.toUniversalString());
        time.incrementMinute();
        System.out.println("After incrementMinute to the next hour: " + time.toUniversalString());

        time.setTime(1, 11, 30);
        System.out.println("Initial time: " + time.toUniversalString());
        time.incrementMinute();
        System.out.println("After incrementMinute: " + time.toUniversalString());

        time.setTime(23, 45, 0);
        System.out.println("Initial time: " + time.toUniversalString());
        time.incrementHour();
        System.out.println("After incrementHour to the next day: " + time.toUniversalString());

        time.setTime(22, 45, 0);
        System.out.println("Initial time: " + time.toUniversalString());
        time.incrementHour();
        System.out.println("After incrementHour: " + time.toUniversalString());
    }
}
