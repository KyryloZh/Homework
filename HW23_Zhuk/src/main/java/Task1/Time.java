package Task1;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Time implements Comparable {
    private int min;
    private int hour;

    public Time(){}

    public Time(int min, int hour){
        if (hour < 0 && hour > 23) System.out.println("Please, enter a valid number.");
        else this.hour = hour;
        if (min < 0 && min > 59) System.out.println("Please, enter a valid number.");
        else this.min = min;
    }

    public int getHour() { return hour; }
    public int getMin() { return min; }

    public void setHour(int hour) { this.hour = hour; }
    public void setMin(int min) { this.min = min; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return min == time.min &&
                hour == time.hour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, hour);
    }

    @Override
    public int compareTo(Object o) {
        Time time = (Time) o;
        if (time.hour >= this.hour) return time.min - this.min;
        else return -1;
    }
}


