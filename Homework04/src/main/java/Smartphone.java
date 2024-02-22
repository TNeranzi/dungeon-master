import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public abstract class Smartphone implements Phone {
    protected String color;
    protected String material;
    protected double imei;
    protected int batteryLeft;
    protected List<Contact> contactsList = new ArrayList<>();
    protected List<Message> messageHistory = new ArrayList<>();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getImei() {
        return imei;
    }

    public void setImei(double imei) {
        this.imei = imei;
    }

    public void addContact(Contact contact) {

        contactsList.add(contact);

        System.out.println("Contact: " +
                contactsList.getLast().firstName + " " +
                contactsList.getLast().lastName +
                " was successfully added to your contact list."
        );
    }

    @Override
    public void getContacts() {

        System.out.println("This is your whole list of contacts: ");
        for (Contact contact : contactsList) {

            System.out.println(contact.index + ". Telephone: " +
                    contact.telephone + ", First Name:" +
                    contact.firstName + ", Last Name: " +
                    contact.lastName + "."
            );
        }
    }

    public void getFirstContact() {

        System.out.println("Your first contact is: " + contactsList.getFirst().index + ". Telephone: " +
                contactsList.getFirst().telephone + ", First Name:" +
                contactsList.getFirst().firstName + ", Last Name: " +
                contactsList.getFirst().lastName + "."
        );
    }

    public void getLastContact() {

        System.out.println("Your last contact is: " + contactsList.getLast().index + ". Telephone: " +
                contactsList.getLast().telephone + ", First Name:" +
                contactsList.getLast().firstName + ", Last Name: " +
                contactsList.getLast().lastName + "."
        );
    }

    public void sendText(Message message) {

        messageHistory.add(message);
        System.out.println(messageHistory.getLast().destination + ", " + messageHistory.getLast().message);

        this.batteryLeft = batteryLeft - messageHistory.size();

        System.out.println("You now have " + batteryLeft + " hours left on your battery.");
    }

    public void getMessageHistory() {

        System.out.println("This is your outgoing message history:");
        for (Message message : messageHistory) {
            System.out.println(message.destination + " - " + message.message);

        }
    }

//    public void getFirstMessage(String phoneNumber) {
//
//            System.out.println(messageHistory.getFirst().);
//
//
//    }

    //    void call();
//    void getCallHistory();
}