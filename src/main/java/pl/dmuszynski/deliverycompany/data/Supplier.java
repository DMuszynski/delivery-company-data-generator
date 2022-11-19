package pl.dmuszynski.deliverycompany.data;

public class Supplier {
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
