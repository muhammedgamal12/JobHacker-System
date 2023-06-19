import Geometric.*;
import   Person.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Triangle t1=new Triangle(5.0,4.0,3.0);
        System.out.println("Geometric.Triangle perimeter is "+t1.getPerimeter(t1.getSide1(),t1.getSide2(),t1.getSide3()));
        System.out.println("Geometric.Triangle Area is "+t1.getArea(t1.getSide1(),t1.getSide2(),t1.getSide3()));
        System.out.println("Geometric.Triangle color is " +t1.getColorname());
        System.out.println("Is triangle filled with color ..? "+t1.isFilled());

        Person p1 = new Person("person");
        System.out.println(p1.toString());

        Student s1=new Student();
        System.out.println(s1.toString());

        Employee e1=new Employee("Employee");
        System.out.println(e1.toString());

        Faculty f1=new Faculty("Faculty");
        System.out.println(f1.toString());

        Staff st1=new Staff("Staff");
        System.out.println(st1.toString());
    }
}