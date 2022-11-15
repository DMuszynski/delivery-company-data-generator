package pl.dmuszynski.deliverycompany.generator;

import java.util.ArrayList;
import java.util.List;

public class CourierGenerator {
    private final PersonGenerator personGenerator = new PersonGenerator();

    public Courier getRandomCourier(int idCourier){
        final Person randomPerson = personGenerator.getRandomPerson();
        return new Courier(idCourier, randomPerson);
    }

    public List<Courier> getRandomCourierList(int courierQuantity) {
        final List<Courier> randomCourierList = new ArrayList<>();
        for(int i = 0; i < courierQuantity; ++i)
            randomCourierList.add(this.getRandomCourier(i));
        return randomCourierList;
    }
}

class Courier {
    private final long idCourier;
    private final Person person;

    public Courier(long idCourier, Person person) {
        this.idCourier = idCourier;
        this.person = person;
    }

    public long getIdCourier() {
        return idCourier;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "idCourier=" + idCourier +
                ", person=" + person +
                '}';
    }
}