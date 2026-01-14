
public class main {
 public static void main(String[] args) {
        try {
            // HotelChain chain = new HotelChain("Global Hotels");
            Address a = new Address("Johar", "Karachi", "123455");
            System.out.println(a.getCity());
            System.out.println(a.getStreet());
            System.out.println(a.getZip());
            System.out.println(a.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}