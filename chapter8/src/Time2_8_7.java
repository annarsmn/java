//Modify class Time2 of Fig. 8.5 to include a tick method that in
//crements the time stored in a Time2 object by one second. Provide method incrementMinute to in
//crement the minute by one and method incrementHour to increment the hour by one. Write a
// program that tests the tick method, the incrementMinute method and the incrementHour method
// to ensure that they work correctly. Be sure to test the following cases:
// a) incrementing into the next minute,
// b) incrementing into the next hour and
// c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).

public class Time2_8_7 {
    private int hour;
    private int minute;
    private int second;

    public Time2_8_7() {
        this(0, 0, 0);
    }

    public Time2_8_7(int hour) {
        this(hour, 0, 0);
    }

    public Time2_8_7(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2_8_7(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2_8_7(Time2_8_5 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-23");

        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-23");

        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
