package pl.dmuszynski.deliverycompany.generator;

import java.util.ArrayList;
import java.util.List;

public class PickupPointGenerator {
    private final AddressGenerator addressGenerator = new AddressGenerator();

    public PickupPoint getRandomPickupPlace(long idPickupPlace) {
        final Address randomAddress = addressGenerator.getRandomAddress();
        return new PickupPoint(idPickupPlace, randomAddress);
    }

    public List<PickupPoint> getRandomPickupPointList(int pickupPointQuantity) {
        final List<PickupPoint> randomPickupPointList = new ArrayList<>();
        for(int i = 0; i < pickupPointQuantity; ++i)
            randomPickupPointList.add(this.getRandomPickupPlace(i));
        return randomPickupPointList;
    }
}

class PickupPoint {
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