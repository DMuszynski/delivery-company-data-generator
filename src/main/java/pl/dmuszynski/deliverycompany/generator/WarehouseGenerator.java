package pl.dmuszynski.deliverycompany.generator;

import java.util.ArrayList;
import java.util.List;

public class WarehouseGenerator {
    private final AddressGenerator addressGenerator = new AddressGenerator();

    public Warehouse getRandomWarehouse(long idWarehouse) {
        final Address randomAddress = addressGenerator.getRandomAddress();
        return new Warehouse(idWarehouse, randomAddress);
    }

    public List<Warehouse> getRandomWarehouseList(int warehouseQuantity) {
        final List<Warehouse> randomWarehouseList = new ArrayList<>();
        for(int i = 0; i < warehouseQuantity; ++i)
            randomWarehouseList.add(this.getRandomWarehouse(i));
        return randomWarehouseList;
    }
}

class Warehouse {
    private final long idWarehouse;
    private final Address address;

    public Warehouse(long idWarehouse, Address address) {
       this.idWarehouse = idWarehouse;
       this.address = address;
    }

    public long getIdWarehouse() {
        return idWarehouse;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ShippingPlace{" +
                "idWarehouse=" + idWarehouse +
                ", address=" + address +
                '}';
    }
}
