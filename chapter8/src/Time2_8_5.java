//It would be perfectly reasonable
// for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since mid
//night rather than the three integer values hour, minute and second. Clients could use the same pub
//lic methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
// the number of seconds since midnight and show that no change is visible to the clients of the class.

public class Time2_8_5 {
    private int secondsSinceMidnight;

    public Time2_8_5() {
        this(0, 0, 0);
    }

    public Time2_8_5(int hour) {
        this(hour, 0, 0);
    }

    public Time2_8_5(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2_8_5(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    public Time2_8_5(Time2_8_5 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.secondsSinceMidnight = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.secondsSinceMidnight = (secondsSinceMidnight % 3600) + hour * 3600;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-23");

        this.secondsSinceMidnight = (secondsSinceMidnight / 3600) * 3600 + (secondsSinceMidnight % 60) + minute * 60;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-23");

        secondsSinceMidnight = (secondsSinceMidnight / 60) * 60 + second;
    }

    public int getHour() {
        return secondsSinceMidnight / 3600;
    }

    public int getMinute() {
        return (secondsSinceMidnight % 3600) / 60;
    }

    public int getSecond() {
        return secondsSinceMidnight % 60;
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
