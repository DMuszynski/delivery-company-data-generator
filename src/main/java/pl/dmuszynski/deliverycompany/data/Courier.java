package pl.dmuszynski.deliverycompany.data;

public class Courier {
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
