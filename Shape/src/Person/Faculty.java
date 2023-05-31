package Person;

public class Faculty extends Employee {

    private int office_hours;
    private  int rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "the class name is  Faculty and the person name is " +
                "name='" + name + '\''
                ;
    }
}
