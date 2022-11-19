package pl.dmuszynski.deliverycompany.data;

public class Warehouse {
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
        return "Warehouse{" +
                "idWarehouse=" + idWarehouse +
                ", address=" + address +
                '}';
    }
}
