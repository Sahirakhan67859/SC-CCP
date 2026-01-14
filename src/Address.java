
import java.util.*;

class Address {
    private final String street, city, zip;

    public Address(String street, String city, String zip) {
        this.street = Objects.requireNonNull(street, "Street cannot be null");
        this.city = Objects.requireNonNull(city, "City cannot be null");
        this.zip = Objects.requireNonNull(zip, "Zip code cannot be null");
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getZip() { return zip; }

    @Override
    public String toString() {
        return street + ", " + city + " " + zip;
    }
}