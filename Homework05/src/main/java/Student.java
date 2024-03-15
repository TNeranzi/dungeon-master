public class Student extends Person{

    protected String studentID;
    protected static String type;

    public Student(String firstName, String lastName, int age, String studentID) {
        super(firstName, lastName, age);
        this.studentID = studentID;
        type = "Student";
    }
    public String getStudentID() {
        return studentID;
    }

    public static String getType() {
        return type;
    }

    public void printStudent() {
        super.print();
        System.out.println(", Employment Status: " + type + ", Student ID: " + getStudentID());
    }
}
