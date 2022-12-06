package pl.dmuszynski.deliverycompany.generator;

import pl.dmuszynski.deliverycompany.data.Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SupplierGenerator {
    private final List<Supplier> supplierList;
    private final String[] supplierName = {
            "DHL", "Poczta Polska", "DPD", "FedEx", "InPost", "UPS",
            "GLS", "AmbroExpress", "Pallex", "Inmedia", "OrlenPaczka",
            "Apaczka", "Geis", "Pocztex", "Paczka w Ruchu"
    };

    public SupplierGenerator() {
        this.supplierList = this.initSupplierList();
    }

    private List<Supplier> initSupplierList() {
        final List<Supplier> tmpSupplierList = new ArrayList<>(this.supplierName.length);
        for (int i = 0; i < this.supplierName.length; ++i)
            tmpSupplierList.add(new Supplier(i+1, supplierName[i], String.format("%09d", new Random().nextInt(1000000000))));

        return tmpSupplierList;
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }
}

