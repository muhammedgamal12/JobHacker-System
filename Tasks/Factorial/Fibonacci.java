import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner anynumber =new Scanner(System.in);
        int number =anynumber.nextInt();

        int firstnumber = 0;
        int secondnumber = 1;
        int temp = firstnumber + secondnumber;


        for (int i = 3; temp <= number; ++i) {
            System.out.print(temp + " , ");
            firstnumber = secondnumber;
            secondnumber = temp;
            temp = firstnumber + secondnumber;

        }


        }

}
