import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner numbers=new Scanner(System.in);

        double x1 = numbers.nextDouble();
        double y1 = numbers.nextDouble();
        double x2 = numbers.nextDouble();
        double y2 = numbers.nextDouble();

        double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(String.format("%.4f", Distance));
    }
}