public class Unemployed extends Person{

    protected final String cnp;
    protected static String type;

    public Unemployed(String firstName, String lastName, int age, String cnp) {
        super(firstName, lastName, age);
        this.cnp = cnp;
        type = "Unemployed";
    }

    public String getCnp() {
        return cnp;
    }
    public static String getType() {
        return type;
    }

    public void printUnemployed() {
        super.print();
        System.out.println(", Employment Status: " + getType() + ", CNP: " + getCnp());
    }
}
