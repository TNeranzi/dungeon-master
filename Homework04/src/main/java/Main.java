public class Main {

    public static void main(String[] args) {

    Smartphone xperiaX = new SonyXperiaX();

    xperiaX.addContact(new Contact(1, 723654895, "Raluca", "Iancu") );

    xperiaX.addContact(new Contact(2, 723654880, "Daniel", "Chitu") );

    xperiaX.addContact(new Contact(3, 725658942, "Condrin", "Zamfir"));

    xperiaX.getFirstContact();

    xperiaX.getLastContact();

    xperiaX.getContacts();

    xperiaX.sendText(new Message(xperiaX.contactsList.get(2).firstName,
                                "Message to Codrin"));

    xperiaX.sendText(new Message(xperiaX.contactsList.getFirst().firstName,
                        "Message to Raluca"));

    xperiaX.getMessageHistory();




    }


}
