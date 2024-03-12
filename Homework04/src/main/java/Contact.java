public class Contact extends Smartphone {

    protected String index;
    protected String telephone;
    protected String firstName;
    protected String lastName;

    public Contact(String telephone) {
        this.telephone = telephone;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
