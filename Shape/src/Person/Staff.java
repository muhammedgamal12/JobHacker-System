package Person;

public class Staff extends Employee {

    private String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "the class name is Staff and the person name is" +
                "name='" + name + '\'' ;
    }
}
