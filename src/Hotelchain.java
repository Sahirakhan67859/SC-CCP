import java.util.*;
class HotelChain {
    private final String name;
    private final List<Hotel> hotels = new ArrayList<>();

    public HotelChain(String name) { this.name = Objects.requireNonNull(name, "Chain name cannot be null"); }

    public void addHotel(Hotel hotel) { hotels.add(Objects.requireNonNull(hotel, "Hotel cannot be null")); }
    public String getName() { return name; }
    public List<Hotel> getHotels() { return Collections.unmodifiableList(hotels); }
}
