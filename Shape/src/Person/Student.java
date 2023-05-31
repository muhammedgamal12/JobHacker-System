package Person;

public class Student extends Person {
    private final String status;

    public Student() {
        super("student");
        status = null;
    }

    @Override
    public String toString() {
        return "the class name is Student and person name is '" + name + '\'';
    }
}
