package pl.dmuszynski.deliverycompany.generator;

import java.util.ArrayList;
import java.util.List;

public class ReceiverGenerator {
    private final PersonGenerator personGenerator = new PersonGenerator();

    public Receiver getRandomReceiver(int idReceiver){
        final Person randomPerson = personGenerator.getRandomPerson();
        return new Receiver(idReceiver, randomPerson);
    }

    public List<Receiver> getRandomReceiverList(int receiverQuantity) {
        final List<Receiver> randomReceiverList = new ArrayList<>();
        for(int i = 0; i < receiverQuantity; ++i)
            randomReceiverList.add(this.getRandomReceiver(i));
        return randomReceiverList;
    }
}

class Receiver {
    private final long idReceiver;
    private final Person person;

    public Receiver(long idReceiver, Person person) {
        this.idReceiver = idReceiver;
        this.person = person;
    }

    public long getIdReceiver() {
        return idReceiver;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "idReceiver=" + idReceiver +
                ", person=" + person +
                '}';
    }
}