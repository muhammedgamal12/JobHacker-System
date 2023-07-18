import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchTask {

    public static void main(String [] args){

        sum();

    }

     public static void sum(){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter two Integer numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }
        catch (InputMismatchException ex){
            sum();
        }


    }
}

