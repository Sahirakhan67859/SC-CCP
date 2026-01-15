import static org.junit.Assert.*;
import org.junit.Test;

public class AddressTest {

    @Test
    public void testConstructorAndGetters() {
        Address address = new Address("123 Main St", "Lahore", "54000");
        assertEquals("123 Main St", address.getStreet());
        assertEquals("Lahore", address.getCity());
        assertEquals("54000", address.getZip());
    }

    @Test
    public void testToString() {
        Address address = new Address("123 Main St", "Lahore", "54000");
        assertEquals("123 Main St, Lahore 54000", address.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testNullStreet() {
        new Address(null, "Lahore", "54000");
    }

    @Test(expected = NullPointerException.class)
    public void testNullCity() {
        new Address("123 Main St", null, "54000");
    }

    @Test(expected = NullPointerException.class)
    public void testNullZip() {
        new Address("123 Main St", "Lahore", null);
    }
}
