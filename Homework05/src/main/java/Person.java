import com.sun.source.tree.ReturnTree;

import java.lang.runtime.SwitchBootstraps;
import java.util.Comparator;


public abstract class Person extends User {

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print() {
        System.out.print("First Name: " + getFirstName() + ", " +
                            "Last Name: " + getLastName() + ", " +
                            "Age: " + getAge()
                            );
    }

    public void printByType(Person user) {
        switch (user) {
            case Student student -> student.printStudent();
            case Unemployed unemployed -> unemployed.printUnemployed();
            case Employee employee -> employee.printEmployee();
            case Retired retired -> retired.printRetired();
            case null, default -> user.print();
        }
    }

}
