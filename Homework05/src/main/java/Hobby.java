public class Hobby {

    protected String name;
    protected int frequency;


    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }
    public int getFrequency() {
        return frequency;
    }


    @Override
    public String toString() {
        return "Hobby Name: " + getName() + ", " + "Occurrence Per Week: " + getFrequency() + ", ";

    }
}
