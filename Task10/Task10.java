package Task10;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(final String[] args) {
        final House house = createExampleHouse();
        System.out.println(house);
        System.out.println("Renovation of the house has begun ");
        house.getFloors().get(0).getRooms().get(2).redrawRoom(ColorRoom.BLUE);
        house.getFloors().get(0).getRooms().get(2).conductElectricity();
        house.getFloors().get(0).getRooms().get(0).changeTypeRoom(TypeRoom.HALL);
        System.out.println("Renovation of the house is over ");
        System.out.println(house);
    }

    public static House createExampleHouse() {
        final List<Floor> floors = new ArrayList<>();

        final List<Room> rooms1 = new ArrayList<>();
        rooms1.add(new Room(TypeRoom.BEDROOM, ColorRoom.PINK, SizeRoom.LARGE, true));
        rooms1.add(new Room(TypeRoom.KITCHEN, ColorRoom.WHITE, SizeRoom.MEDIUM, true));
        rooms1.add(new Room(TypeRoom.BATHROOM, ColorRoom.RED, SizeRoom.SMALL, false));
        final Floor floor1 = new Floor(rooms1);

        floors.add(floor1);

        final List<Room> rooms2 = new ArrayList<>();
        rooms2.add(new Room(TypeRoom.BEDROOM, ColorRoom.BLUE, SizeRoom.LARGE, true));
        rooms2.add(new Room(TypeRoom.HALL, ColorRoom.RED, SizeRoom.MEDIUM, true));
        final Floor floor2 = new Floor(rooms2);

        floors.add(floor2);

        return new House(floors);
    }
}
