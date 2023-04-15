import java.util.Scanner;

public class Basics {
    public static void main(String[] args)
    {
        Scanner numbers=new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();

        int x= a + b;

        System.out.println("x = "+x);
    }
}