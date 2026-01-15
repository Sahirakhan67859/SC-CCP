import java.time.LocalDate;
import java.util.*;
class Reservation {
    private final int number;
    private final Guest guest;
    private final Hotel hotel;
    private final Room room;
    private final LocalDate start, end;

    public Reservation(int number, Guest guest, Hotel hotel, Room room, LocalDate start, LocalDate end) {
        if (number <= 0) throw new IllegalArgumentException("Reservation number must be positive");
        this.number = number;
        this.guest = Objects.requireNonNull(guest, "Guest cannot be null");
        this.hotel = Objects.requireNonNull(hotel, "Hotel cannot be null");
        this.room = Objects.requireNonNull(room, "Room cannot be null");
        this.start = Objects.requireNonNull(start, "Start date cannot be null");
        this.end = Objects.requireNonNull(end, "End date cannot be null");
        if (start.isAfter(end)) throw new IllegalArgumentException("Start date cannot be after end date");

        // Link objects
        room.occupy(this);
        guest.addReservation(this);
        hotel.addReservation(this);
    }

    public int getNumber() { return number; }
    public Guest getGuest() { return guest; }
    public Room getRoom() { return room; }
    public Hotel getHotel() { return hotel; }
    public LocalDate getStart() { return start; }
    public LocalDate getEnd() { return end; }

    @Override
    public String toString() {
        return "Reservation #" + number + " for " + guest + " in " + room + " at " + hotel.getName();
    }
}