public class Date_8_8 {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date_8_8(int month, int day, int year) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        if (day <= 0 || day > getDaysInMonth(month, year))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf( "Date object constructor for date %s%n", this);
    }

    private int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysPerMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public void nextDay() {
        day++;
        if (day > getDaysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}