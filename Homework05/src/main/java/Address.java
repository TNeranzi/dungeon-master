public class Address extends Hobby{

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
}
