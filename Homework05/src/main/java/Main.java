import java.util.*;

public class Main {

    public static void main(String[] args) {

    Person student = new Student("Richard", "Willians", 45, "IE101112");
    Person unemployed = new Unemployed("Kevin", "Riddley", 19, "C2564352");
    Person employee = new Employee("John", "Doe", 25,"CD1234");
    Person retired = new Retired("Sabrina", "Walters", 52, "PE212223");
    Person retired2 = new Retired("Sabrina", "Walters", 52, "PE212223");

        Set<Person> userSet = new HashSet<>();

        userSet.add(student);
        userSet.add(unemployed);
        userSet.add(employee);
        userSet.add(retired);
        userSet.add(retired2);

        for (Person user: userSet) {
            user.printByType(user);
        }

    final Hobby painting = new Address("Painting", 2, "Dorobantilor", 15, "2A", "16");
    final Hobby knitting = new Address("Knitting", 4, "Rozelor", 6, "3E", "5");
    final Hobby writing = new Address("Writing", 2, "Lalelelor", 2, "1C", "22");
    final Hobby basketball = new Address("Basketball", 1, "Muresenilor", 6, "4", "11");

    List<Hobby> locations = new ArrayList<>();
        locations.add(painting);
        locations.add(knitting);
        locations.add(writing);
        locations.add(basketball);

       // System.out.println(locations);

    HashMap<Person, List<Hobby>> userHobbies= new HashMap<Person, List<Hobby>>();

    userHobbies.put(employee, locations);
    userHobbies.put(unemployed, locations);
    userHobbies.put(student, locations);
    userHobbies.put(retired, locations);

        //System.out.println(userHobbies);


    }
}
