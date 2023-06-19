package Geometric;

import Person.Person;

import java.util.Date;

public class Triangle extends GeometricObject {

    private double side1 ;
    private double side2 ;
    private double side3 ;

    public Triangle(){
        super("red",true,new Date());
        side1 =0.1;
        side2 =0.1;
        side3 =0.1;
    }

    public Triangle( double side1, double side2, double side3) {
        super("red", true, new Date());
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter( double side1 ,double side2,double side3){

        double perimeter = side1+side2+side3 ;

        return perimeter;
    }

    public double getArea(double side1 ,double side2,double side3){
        double perimeter =0.5*getPerimeter(side1,side2,side3);
        double Area = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3)) ;

        return Area;
    }

    @Override
    public String toString() {
        return "Geometric.Triangle:" +
                "side1 =" + side1 +
                ", side2 =" + side2 +
                ", side3 =" + side3;
    }
}
