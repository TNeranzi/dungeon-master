public abstract class Person{

    protected String firstName;
    protected String lastName;
    protected int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }


    //Printing information for users without a type
    public void print() {
        System.out.print("First Name: " + getFirstName() + ", " +
                            "Last Name: " + getLastName() + ", " +
                            "Age: " + getAge()
                            );
    }

    //Method that decides the message to be printed based on the person's "type"
    public void printByType(Person user) {
        switch (user) {
            case Student student -> student.printStudent();
            case Unemployed unemployed -> unemployed.printUnemployed();
            case Employee employee -> employee.printEmployee();
            case Retired retired -> retired.printRetired();
            default -> user.print();
        }
    }
}
