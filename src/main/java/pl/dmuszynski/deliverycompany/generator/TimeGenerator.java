package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;

import java.util.*;

public class TimeGenerator {

    public Time getRandomTime(long idTime) {
        final Faker faker = new Faker();
        final Date randomDate = faker.date().birthday(1, 5);
        final GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(randomDate);

        int randomDay = gc.get(Calendar.DAY_OF_MONTH);
        int randomMonth = gc.get(Calendar.MONTH);
        int randomQuarter = (gc.get(Calendar.MONTH) / 3) + 1;
        int randomYear = gc.get(Calendar.YEAR);
        return new Time(idTime, randomDay, randomMonth, randomQuarter, randomYear);
    }

    public List<Time> getRandomTimeList(int timeQuantity) {
        final List<Time> randomTimeList = new ArrayList<>();
        for(int i = 0; i < timeQuantity; ++i)
            randomTimeList.add(this.getRandomTime(i));
        return randomTimeList;
    }
}

class Time {
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