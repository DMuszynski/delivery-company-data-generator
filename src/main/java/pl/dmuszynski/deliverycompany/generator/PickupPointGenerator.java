package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Address;
import pl.dmuszynski.deliverycompany.data.PickupPoint;

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

