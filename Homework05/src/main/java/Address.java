public class Address extends Hobby {

    protected String street;
    protected int number;
    protected String unit;
    protected String room;

    public Address(String name, int frequency, String street, int number, String unit, String room) {
        super(name, frequency);
        this.street = street;
        this.number = number;
        this.unit = unit;
        this.room = room;
    }

    public String getStreet() {
        return street;
    }
    public int getNumber() {
        return number;
    }
    public String getUnit() {
        return unit;
    }
    public String getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Street: " + getStreet() + ", " +
                "Street Number: " + getNumber() + ", " +
                "Building Unit: " + getUnit() + ", " +
                "Room Number: " + getRoom() + "\n ";
    }
}
