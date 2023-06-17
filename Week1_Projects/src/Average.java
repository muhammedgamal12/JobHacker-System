import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        Scanner numbers=new Scanner(System.in);

        double a =numbers.nextDouble();
        double b =numbers.nextDouble();
        double c =numbers.nextDouble();

        double Average= (a/10*2) +(b/10*3) + (c/10*5) ;

        System.out.println("MEDIA = "+String.format("%.1f",Average));
    }
}