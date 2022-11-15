package pl.dmuszynski.deliverycompany.data;

public class Address {
    private final String street;
    private final String city;
    private final String buildingNumber;

    public Address(String street, String city, String buildingNumber) {
        this.street = street;
        this.city = city;
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                '}';
    }
}
