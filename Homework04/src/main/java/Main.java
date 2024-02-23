public class Main {

    public static void main(String[] args) {

    Smartphone xperiaX = new SonyXperiaX();

    Smartphone xiaomiRedmiA2 = new XiaomiRedmiA2();

    //Adding contacts

    xperiaX.addContact("1", "0723654895", "Raluca", "Iancu");

    xperiaX.addContact("2", "0723654880", "Daniel", "Chitu");

    xperiaX.addContact("3", "0725658942", "Condrin", "Zamfir");

        xperiaX.separator();

    xperiaX.getFirstContact();

        xperiaX.separator();

    xperiaX.getLastContact();

        xperiaX.separator();

    xperiaX.getContacts();

        xperiaX.separator();


    //Sending messages and calculating battery left

    xiaomiRedmiA2.sendText("0725658942", "This is my message to Codrin");

        xiaomiRedmiA2.separator();

    xperiaX.sendText("0723654895", "This is my message to Raluca");

        xperiaX.separator();

    xperiaX.getMessageHistory();

        xperiaX.separator();

    xperiaX.getFirstMessage("0725658942");

        xperiaX.separator();

    xperiaX.getSecondMessage("0723654895");

        xperiaX.separator();

    xperiaX.sendText("0723654895", "Second message to Raluca");

        xperiaX.separator();


    //Making calls and calculating battery left

    xperiaX.call("0723654895");

        xperiaX.separator();

    xperiaX.call("0723654880");

        xperiaX.separator();

    xperiaX.viewCallHistory();

    }


}
