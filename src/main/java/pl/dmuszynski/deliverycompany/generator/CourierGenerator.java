package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Courier;
import pl.dmuszynski.deliverycompany.data.Person;

import java.util.ArrayList;
import java.util.List;

public class CourierGenerator {
    private final PersonGenerator personGenerator = new PersonGenerator();

    public Courier getRandomCourier(long idCourier){
        final Person randomPerson = personGenerator.getRandomPerson();
        return new Courier(idCourier, randomPerson);
    }

    public List<Courier> getRandomCourierList(int courierQuantity) {
        final List<Courier> randomCourierList = new ArrayList<>();
        for(int i = 0; i < courierQuantity; ++i)
            randomCourierList.add(this.getRandomCourier(i+1));
        return randomCourierList;
    }
}

