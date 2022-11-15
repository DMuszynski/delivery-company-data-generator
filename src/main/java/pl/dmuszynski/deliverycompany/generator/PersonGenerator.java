package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;

import java.util.Locale;

public class PersonGenerator {
    private final AddressGenerator addressGenerator = new AddressGenerator();

    public Person getRandomPerson() {
        final Faker faker = new Faker(new Locale("pl-PL"));
        final String randomName = faker.name().firstName();
        final String randomLastname = faker.name().lastName();
        final String randomPhoneNumber = faker.phoneNumber().phoneNumber();
        final Address randomAddress = addressGenerator.getRandomAddress();

        return new Person(randomName, randomLastname, randomPhoneNumber, randomAddress);
    }
}

class Person {
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