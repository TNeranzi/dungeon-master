public class Contact extends Smartphone {

    protected String index;
    protected String telephone;
    protected String firstName;
    protected String lastName;

    public Contact(String telephone) {
        this.telephone = telephone;
    }

    public Contact(String index, String telephone, String firstName, String lastName) {
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
