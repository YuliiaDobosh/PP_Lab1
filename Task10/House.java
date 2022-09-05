package Task10;

import java.util.List;

public class House {
    private List<Floor> floors;

    public House(final List<Floor> floors) {
        this.floors = floors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(final List<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "\n" + floors ;
    }

}
