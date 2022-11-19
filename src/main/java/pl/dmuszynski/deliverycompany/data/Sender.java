package pl.dmuszynski.deliverycompany.data;

public class Sender {
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
