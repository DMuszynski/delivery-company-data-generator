package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Person;
import pl.dmuszynski.deliverycompany.data.Sender;

import java.util.ArrayList;
import java.util.List;

public class SenderGenerator {
    private final PersonGenerator personGenerator = new PersonGenerator();

    public Sender getRandomSender(int idSender){
        final Person randomPerson = personGenerator.getRandomPerson();
        return new Sender(idSender, randomPerson);
    }

    public List<Sender> getRandomSenderList(int senderQuantity) {
        final List<Sender> randomSenderList = new ArrayList<>();
        for(int i = 0; i < senderQuantity; ++i)
            randomSenderList.add(this.getRandomSender(i+1));
        return randomSenderList;
    }
}
