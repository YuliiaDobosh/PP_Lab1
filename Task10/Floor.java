package Task10;

import java.util.List;

public class Floor {
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public Floor(final List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (final Room room : rooms){
            stringBuilder.append(room).append("\n");
        }
        return stringBuilder.toString();
    }
}
