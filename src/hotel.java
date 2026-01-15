import java.util.*;
class Hotel {
    private final String name;
    private final List<RoomType> roomTypes = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final HotelChain chain;

    public Hotel(String name, HotelChain chain) {
        this.name = Objects.requireNonNull(name, "Hotel name cannot be null");
        this.chain = Objects.requireNonNull(chain, "HotelChain cannot be null");
        chain.addHotel(this);
    }

    public void addRoomType(RoomType type) { roomTypes.add(Objects.requireNonNull(type, "RoomType cannot be null")); }
    public void addReservation(Reservation res) { reservations.add(Objects.requireNonNull(res, "Reservation cannot be null")); }

    public String getName() { return name; }
    public List<RoomType> getRoomTypes() { return Collections.unmodifiableList(roomTypes); }
    public List<Reservation> getReservations() { return Collections.unmodifiableList(reservations); }
    public HotelChain getChain() { return chain; }
}