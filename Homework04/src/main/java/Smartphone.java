import java.util.ArrayList;
import java.util.List;

public abstract class Smartphone implements Phone {

    //attributes
    protected String color;
    protected String material;
    protected double imei;
    protected int batteryLeft;
    protected List<Contact> contactsList = new ArrayList<>();
    protected List<Message> messageHistory = new ArrayList<>();
    protected List<Contact> callHistory = new ArrayList<>();

    //Can be used to separate results for easier readability
    public void separator() {
        System.out.println("-----------------------------");
    }

    // Add contacts to the list
    public void addContact(String index, String telephone, String firstName, String lastName) {

        contactsList.add(new Contact(index, telephone, firstName, lastName));

        System.out.println("Contact: " +
                contactsList.getLast().firstName + " " +
                contactsList.getLast().lastName +
                " was successfully added to your contact list."
        );
    }

    // Displays the entire contact list
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

    //Displays only the first contact
    public void getFirstContact() {

        System.out.println("Your first contact is: " + contactsList.getFirst().index + ". Telephone: " +
                contactsList.getFirst().telephone + ", First Name:" +
                contactsList.getFirst().firstName + ", Last Name: " +
                contactsList.getFirst().lastName + "."
        );
    }

    //Displays only the last contact
    public void getLastContact() {

        System.out.println("Your last contact is: " + contactsList.getLast().index + ". Telephone: " +
                contactsList.getLast().telephone + ", First Name:" +
                contactsList.getLast().firstName + ", Last Name: " +
                contactsList.getLast().lastName + "."
        );
    }

    //Sends a text message to a certain number and calculates the battery left
    public void sendText(String phoneNumber, String message) {

        messageHistory.add(new Message(phoneNumber, message));
        System.out.println("Message: \"" + messageHistory.getLast().message + "\" sent to: " + messageHistory.getLast().destination);

        this.batteryLeft = batteryLeft - 1;
        System.out.println("You now have " + batteryLeft + " hours left on your battery.");
    }

    //Displays the whole list of messages sent
    public void getMessageHistory() {

        System.out.println("This is your outgoing message history:");
        for (Message message : messageHistory) {
            System.out.println(message.destination + " - " + message.message);

        }
    }

    //Displays only the first message sent
    public void getFirstMessage(String phoneNumber) {
        System.out.println("You have sent the following message: \"" +
                messageHistory.getFirst().message +
                "\" to the contact " + phoneNumber);
    }

    //Displays the second message sent, only if it exists
    public void getSecondMessage(String phoneNumber) {

        if (messageHistory.contains(1)) {
            System.out.println("You have sent the following message: \"" +
                    messageHistory.get(1).message +
                    "\" to the contact " + phoneNumber);
        } else
            System.out.println("You have sent only one message from this phone.");
    }

    //Makes a call to a given number and calculates the battery left
    public void call(String call) {
        callHistory.add(new Contact(call));

        System.out.println("You have made a call to: " +
                callHistory.getLast().telephone);

        this.batteryLeft = batteryLeft - 2;
        System.out.println("You now have " + batteryLeft + " hours left on your battery.");

    }

    //Displays the entire call history
    public void viewCallHistory() {

        System.out.println("This is your outgoing call history:");
        for (Contact call : callHistory)
            System.out.println(call.telephone);


    }
}