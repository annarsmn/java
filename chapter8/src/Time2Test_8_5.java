public class Time2Test_8_5 {
    public static void main(String[] args) {
        Time2_8_5 t1 = new Time2_8_5();
        Time2_8_5 t2 = new Time2_8_5(2);
        Time2_8_5 t3 = new Time2_8_5(21, 34);
        Time2_8_5 t4 = new Time2_8_5(12, 25, 42);
        Time2_8_5 t5 = new Time2_8_5(t4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        try {
            Time2_8_5 t6 = new Time2_8_5(27, 74, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2_8_5 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}
