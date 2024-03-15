import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Hobby extends User{

    protected String name;
    protected int frequency;


    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
