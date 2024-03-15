public class Retired extends Person{
    protected String pensionSlip;
    protected static String type;


    public Retired(String firstName, String lastName, int age, String pensionSlip) {
        super(firstName, lastName, age);
        this.pensionSlip = pensionSlip;
        type = "Retired";
    }

    public String getPensionSlip() {
        return pensionSlip;
    }

    public void printRetired() {
        super.print();
        System.out.println(", Employment Status: " + type + ", Pension Slip No: " + getPensionSlip());
    }
}
