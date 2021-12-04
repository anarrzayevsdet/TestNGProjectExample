package testData;

import com.github.javafaker.Faker;

public class AddressTestData {

    Faker faker;

    private final String addressStreet1;
    private final String addressStreet2;
    private final String city;
    private final String state;
    private final String zipcode;
    private final String country;



    public AddressTestData() {
        faker = new Faker();
        addressStreet1 = faker.address().streetAddress();
        addressStreet2 = faker.address().streetAddressNumber();
        city = faker.address().cityName();
        state = faker.address().state();
        zipcode = faker.address().zipCode();
        country = faker.country().name();
    }

    public String getAddressStreet1() {
        return addressStreet1;
    }

    public String getAddressStreet2() {
        return addressStreet2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }
}
