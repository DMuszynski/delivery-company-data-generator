package pl.dmuszynski.deliverycompany.generator;

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

    public Supplier getRandomSupplier() {
        return supplierList.get(new Random().nextInt(supplierList.size()));
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }
}

class Supplier {
    private final long idSupplier;
    private final String name;
    private final String NIP;

    public Supplier(long idSupplier, String name, String NIP) {
        this.idSupplier = idSupplier;
        this.name = name;
        this.NIP = NIP;
    }

    public long getIdSupplier() {
        return idSupplier;
    }

    public String getName() {
        return name;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "idSupplier=" + idSupplier +
                ", name='" + name + '\'' +
                ", NIP='" + NIP + '\'' +
                '}';
    }
}