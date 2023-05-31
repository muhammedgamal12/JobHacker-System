package Person;

import javax.xml.crypto.Data;

public class Employee extends Person{
    private int office;
    private double salary;
    private Data date;

    public Employee(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "the class name is Employee and the person name is " +
                "name='" + name + '\'' ;
    }
}
