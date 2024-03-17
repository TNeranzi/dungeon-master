import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Added people
        Person student = new Student("Richard", "Willians", 45, "IE101112");
        Person unemployed = new Unemployed("Kevin", "Riddley", 19, "C2564352");
        Person employee = new Employee("John", "Doe", 25, "CD1234");
        Person retired = new Retired("Sabrina", "Walters", 52, "PE212223");
        Person retired2 = new Retired("Sabrina", "Walters", 52, "PE212223");

        Set<Person> userSet = new HashSet<>();

        userSet.add(student);
        userSet.add(unemployed);
        userSet.add(employee);
        userSet.add(retired);
        userSet.add(retired2);

        //Added set to list for sorting purposes
        List<Person> userList = new ArrayList<>(userSet);

        //Sorting list
        userList.sort(new SortByNameAndAge());

        //Printing users' list
        for (Person user : userList) {
            user.printByType(user);
        }

        // Added hobies with addresses
        final Hobby painting = new Address("Painting", 2, "Dorobantilor", 15, "2A", "16");
        final Hobby knitting = new Address("Knitting", 4, "Rozelor", 6, "3E", "5");
        final Hobby writing = new Address("Writing", 2, "Lalelelor", 2, "1C", "22");
        final Hobby basketball = new Address("Basketball", 1, "Muresenilor", 6, "4", "11");

        HashMap<Person, List<Hobby>> userHobbies = new HashMap<Person, List<Hobby>>();

        // Added hobies to each user
        userHobbies.put(employee, new ArrayList<>());
            userHobbies.get(employee).add(painting);
            userHobbies.get(employee).add(knitting);
            userHobbies.get(employee).add(basketball);
        userHobbies.put(unemployed, new ArrayList<>());
            userHobbies.get(unemployed).add(painting);
            userHobbies.get(unemployed).add(writing);
        userHobbies.put(student, new ArrayList<>());
            userHobbies.get(student).add(knitting);
            userHobbies.get(student).add(basketball);
        userHobbies.put(retired, new ArrayList<>());
            userHobbies.get(retired).add(writing);
            userHobbies.get(retired).add(knitting);

        System.out.println(userHobbies.get(employee));


    }
}
