public class XiaomiRedmiNote12 extends Xiaomi {
    protected static final int batteryLife = 68;

    //Overridden method to take into account the specific batteryLife of the phone
    @Override
    public void sendText(String phoneNumber, String message) {
        batteryLeft = batteryLife;
        super.sendText(phoneNumber, message);
    }
}
