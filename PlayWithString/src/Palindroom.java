import java.util.Scanner;

public class Palindroom extends ReverseString {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String newstring = sc.nextLine();
        checkPalindroom(newstring);
    }
    public  static void checkPalindroom(String text){

      String temp = reverseString(text);
      if(temp.equals(text))
        System.out.println(text + " is a Palindroom");
        else
            System.out.println(text + " is not a palindroom");
    }
}
