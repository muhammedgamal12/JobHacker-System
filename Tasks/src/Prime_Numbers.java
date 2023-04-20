import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

public class Prime_Numbers
{
    public static void main(String[] args)
    {
        Scanner numbers =new Scanner(System.in);
        int number=numbers.nextInt();

        int check = 1;

        for (int i = 2 ; i <=number/2;i++ )
        {
            if (number % i ==0)
                check = 0;

        }

        if (check == 0 )
            System.out.println(number + " is not a prime number");
        else
            System.out.println(number + " is  a prime number");

    }




}
