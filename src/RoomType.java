import java.util.*;
class RoomType {
    private final RoomKind kind;
    private final Money cost;
    private final List<Room> rooms = new ArrayList<>();

    public RoomType(RoomKind kind, Money cost) {
        this.kind = Objects.requireNonNull(kind, "Room kind cannot be null");
        this.cost = Objects.requireNonNull(cost, "Cost cannot be null");
    }

    public void addRoom(Room room) { rooms.add(Objects.requireNonNull(room, "Room cannot be null")); }

    public RoomKind getKind() { return kind; }
    public Money getCost() { return cost; }
    public List<Room> getRooms() { return Collections.unmodifiableList(rooms); }

    @Override
    public String toString() { return kind + " (" + cost + ")"; }
}