package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Person;
import pl.dmuszynski.deliverycompany.data.Receiver;

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
            randomReceiverList.add(this.getRandomReceiver(i+1));
        return randomReceiverList;
    }
}

