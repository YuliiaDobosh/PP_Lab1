package Task10;

import Task10.TypeRoom;

public class Room {
    private TypeRoom typeRoom;
    private ColorRoom colorRoom;
    private SizeRoom sizeRoom;
    private boolean electricity;

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(final TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public ColorRoom getColorRoom() {
        return colorRoom;
    }

    public void setColorRoom(final ColorRoom colorRoom) {
        this.colorRoom = colorRoom;
    }

    public SizeRoom getSizeRoom() {
        return sizeRoom;
    }

    public void setSizeRoom(final SizeRoom sizeRoom) {
        this.sizeRoom = sizeRoom;
    }

    public boolean isElectricity() {
        return electricity;
    }

    public void setElectricity(final boolean electricity) {
        this.electricity = electricity;
    }

    @Override
    public String toString() {
        return "typeRoom=" + typeRoom + ", colorRoom=" + colorRoom + ", sizeRoom=" + sizeRoom + ", electricity=" + electricity + ' ';
    }

    public Room(final TypeRoom typeRoom, final ColorRoom colorRoom, final SizeRoom sizeRoom, final boolean electricity) {
        this.typeRoom = typeRoom;
        this.colorRoom = colorRoom;
        this.sizeRoom = sizeRoom;
        this.electricity = electricity;
    }

    public void redrawRoom(final ColorRoom color) {
        setColorRoom(color);
    }

    public void changeTypeRoom(final TypeRoom typeRoom) {
        setTypeRoom(typeRoom);
    }

    public void conductElectricity() {
        setElectricity(true);
    }

    public void dismantleElectricity() {
        setElectricity(false);
    }



}
