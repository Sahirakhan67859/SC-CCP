import java.util.*;
class Guest {
    private final String name;
    private final Address address;
    private final CreditCard card;
    private final Identity id;
    private final List<Reservation> reservations = new ArrayList<>();

    public Guest(String name, Address address, CreditCard card, Identity id) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.address = Objects.requireNonNull(address, "Address cannot be null");
        this.card = Objects.requireNonNull(card, "Credit card cannot be null");
        this.id = Objects.requireNonNull(id, "Identity cannot be null");
    }

    public void addReservation(Reservation res) {
        reservations.add(Objects.requireNonNull(res, "Reservation cannot be null"));
    }

    public String getName() { return name; }
    public List<Reservation> getReservations() { return Collections.unmodifiableList(reservations); }

    @Override
    public String toString() { return name; }
}