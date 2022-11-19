package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Address;
import pl.dmuszynski.deliverycompany.data.Warehouse;

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

