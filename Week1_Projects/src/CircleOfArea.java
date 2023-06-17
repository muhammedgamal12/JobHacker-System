import java.util.Scanner;

public class CircleOfArea {
    public static void main(String[] args)
    {
        Scanner radius = new Scanner(System.in);

        double r = radius.nextDouble();
        final  double PI = 3.14159;
        double Area = PI * (r * r);

        System.out.println("A="+String.format("%.4f",Area));
    }
}
