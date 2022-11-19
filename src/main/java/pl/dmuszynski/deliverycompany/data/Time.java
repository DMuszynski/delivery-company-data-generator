package pl.dmuszynski.deliverycompany.data;

public class Time {
    private final long idTime;
    private final int day;
    private final int month;
    private final int quarter;
    private final int year;

    public Time(long idTime, int day, int month, int quarter, int year) {
        this.idTime = idTime;
        this.day = day;
        this.month = month;
        this.quarter = quarter;
        this.year = year;
    }

    public long getIdTime() {
        return idTime;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getQuarter() {
        return quarter;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Time{" +
                "idTime=" + idTime +
                ", day=" + day +
                ", month=" + month +
                ", quarter=" + quarter +
                ", year=" + year +
                '}';
    }
}
