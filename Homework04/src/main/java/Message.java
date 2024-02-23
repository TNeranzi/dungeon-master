public class Message extends Smartphone {

    protected String message;
    protected String destination;

    public Message(String destination, String message) {
        this.destination = destination;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message: " +
                "Destination = " + destination +
                ", message = " + message;
    }
}
