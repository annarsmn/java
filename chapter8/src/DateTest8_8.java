public class DateTest8_8 {
    public static void main(String[] args) {
        Date_8_8 date1 = new Date_8_8(12, 31, 2024);
        System.out.println("Starting date: " + date1);

        for (int i = 0; i < 5; i++) {
            date1.nextDay();
            System.out.println("Next day: " + date1);
        }

        Date_8_8 date2 = new Date_8_8(11, 30, 2024);
        System.out.println("Starting date: " + date2);

        for (int i = 0; i < 5; i++) {
            date2.nextDay();
            System.out.println("Next day: " + date2);
        }

        Date_8_8 date3 = new Date_8_8(2, 28, 2024);
        System.out.println("Starting date: " + date3);

        for (int i = 0; i < 5; i++) {
            date3.nextDay();
            System.out.println("Next day: " + date3);
        }
    }
}
