package pl.dmuszynski.deliverycompany.data;

public class Person {
    private final String name;
    private final String lastname;
    private final String phone;
    private final Address address;

    public Person(String name, String lastname, String phone, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address +
                '}';
    }
}
