import java.util.Scanner;

public class EvenOrOdd {
    public  static void main(String [] args)
    {
        Scanner UserNumber = new Scanner(System.in);

        while (true) {
            int number = UserNumber.nextInt();
            if (number == 00) // Press "00" To Exit
                break;
            else if (number % 2 == 0)
                System.out.println(number + " Is Even");
            else
                System.out.println(number + " Is Odd");
        } // While Ending
    }
}
