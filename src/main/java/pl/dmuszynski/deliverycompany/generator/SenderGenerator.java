package pl.dmuszynski.deliverycompany.generator;

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
            randomSenderList.add(this.getRandomSender(i));
        return randomSenderList;
    }
}

class Sender {
    private final long idSender;
    private final Person person;

    public Sender(long idSender, Person person) {
        this.idSender = idSender;
        this.person = person;
    }

    public long getIdSender() {
        return idSender;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "idSender=" + idSender +
                ", person=" + person +
                '}';
    }
}