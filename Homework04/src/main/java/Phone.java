import java.util.List;

public interface Phone {

    void addContact(Contact contact);
    void getContacts();
    void getFirstContact();
    void getLastContact();
    void sendText(Message message);
    void getMessageHistory();

//    void call();
//    void getCallHistory();

}
