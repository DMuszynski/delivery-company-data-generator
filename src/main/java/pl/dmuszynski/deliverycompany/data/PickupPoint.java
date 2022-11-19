package pl.dmuszynski.deliverycompany.data;

public class PickupPoint {
    private final long idPickupPoint;
    private final Address address;

    public PickupPoint(long idPickupPoint, Address address) {
        this.idPickupPoint = idPickupPoint;
        this.address = address;
    }

    public long getIdPickupPoint() {
        return idPickupPoint;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PickupPlace{" +
                "idPickupPoint=" + idPickupPoint +
                ", address=" + address +
                '}';
    }
}
