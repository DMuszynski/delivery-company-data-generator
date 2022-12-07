package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;
import pl.dmuszynski.deliverycompany.data.Time;

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
            randomTimeList.add(this.getRandomTime(i+1));
        return randomTimeList;
    }
}
