import java.util.*;
class Room {
    private final int number;
    private final RoomType type;
    private Reservation currentReservation;

    public Room(int number, RoomType type) {
        if (number <= 0) throw new IllegalArgumentException("Room number must be positive");
        this.number = number;
        this.type = Objects.requireNonNull(type, "RoomType cannot be null");
    }

    public boolean isOccupied() { return currentReservation != null; }

    public void occupy(Reservation reservation) {
        if (isOccupied()) throw new IllegalStateException("Room already occupied");
        currentReservation = Objects.requireNonNull(reservation, "Reservation cannot be null");
    }

    public int getNumber() { return number; }
    public RoomType getType() { return type; }
    public Reservation getCurrentReservation() { return currentReservation; }

    @Override
    public String toString() {
        return "Room " + number + " (" + type.getKind() + ") - Occupied: " + isOccupied();
    }
}