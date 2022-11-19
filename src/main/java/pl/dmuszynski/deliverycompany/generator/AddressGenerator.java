package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;
import pl.dmuszynski.deliverycompany.data.Address;

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

