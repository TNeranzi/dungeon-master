public class Contact extends Smartphone{

    protected int index;
    protected int telephone;
    protected String firstName;
    protected String lastName;


    public Contact(int index, int telephone, String firstName, String lastName) {
        this.index = index;
        this.telephone = telephone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "index=" + index +
                ", telephone=" + telephone +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                '}';
    }

}
