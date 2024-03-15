public class Employee extends Person{

    protected final String companyID;
    protected static String type;

    public Employee(String firstName, String lastName, int age, String companyID) {
        super(firstName, lastName, age);
        this.companyID = companyID;
        type = "Employee";
    }

    public String getCompanyID(){
        return companyID;
    }

    public void printEmployee() {
        super.print();
        System.out.println(", Employment Status: " + type + ", Company ID: " + getCompanyID());
    }
}
