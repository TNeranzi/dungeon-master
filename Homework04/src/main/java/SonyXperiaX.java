import java.util.List;

public class SonyXperiaX extends Sony{

    protected static final int batteryLife = 40;

    @Override
    public void addContact(Contact contact){
        super.addContact(contact);
    }

    @Override
    public void getContacts() {
        super.getContacts();
    }

    @Override
    public void getFirstContact() {
        super.getFirstContact();
    }

    @Override
    public void getLastContact() {
        super.getLastContact();
    }

    @Override
    public void sendText(Message message) {
        batteryLeft = batteryLife;
        super.sendText(message);
    }
}
