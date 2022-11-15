package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;

import java.util.Locale;

public class AddressGenerator {

    public Address getRandomAddress(){
        final Faker faker = new Faker(new Locale("pl-PL"));
        final String randomStreet = faker.address().streetAddress();
        final String randomCity = faker.address().cityName();
        final String randomBuildingNumber = faker.address().buildingNumber();

        return new Address(randomStreet, randomCity, randomBuildingNumber);
    }
}

class Address{
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