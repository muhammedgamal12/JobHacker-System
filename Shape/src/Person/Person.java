package Person;

public class Person {
    protected String name;
    private  String address;
    private  int  phone;
    private  String email;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class is Person " +
                " and the name is ='" + name + '\''
                ;
    }
}
