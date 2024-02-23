public interface Phone {

    void addContact(String index, String telephone, String firstName, String lastName);
    void getContacts();
    void sendText(String phoneNumber, String message);
    void getMessageHistory();
    void call(String phone);
    void viewCallHistory();

}
