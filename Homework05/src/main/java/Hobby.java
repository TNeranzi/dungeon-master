import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Hobby {

    protected String name;
    protected int frequency;
    protected List<Address> location = new ArrayList<>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }
}
