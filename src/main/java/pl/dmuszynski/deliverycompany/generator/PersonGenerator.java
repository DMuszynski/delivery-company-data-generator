package pl.dmuszynski.deliverycompany.generator;

import com.github.javafaker.Faker;
import pl.dmuszynski.deliverycompany.data.Address;
import pl.dmuszynski.deliverycompany.data.Person;

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

