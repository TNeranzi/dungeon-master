import java.util.Comparator;

public class SortByNameAndAge implements Comparator<Person> {

    // Made only one comparator that sorts by name and age
    @Override
    public int compare(Person person1, Person person2) {

        int compareAge = person1.getAge() - person2.getAge();

        int compareName = person1.getFirstName().compareTo(person2.getFirstName());

        return (compareName == 0) ? compareAge : compareName;
    }
}
