import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.println(factorial(num.nextInt()));
    }
public  static int factorial(int number)
{
    int result = number;

    for (int i = number-1 ; i > 0;i--)
    result *= i;

    return result;
}

}
