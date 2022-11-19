package pl.dmuszynski.deliverycompany.data;

public class Receiver {
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
