import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String newstring = sc.nextLine();

        System.out.println(reverseString(newstring));


    }

    public static String  reverseString(String anystring){

        String revstring="";

        for (int s=anystring.length()-1;s>=0;s--)
        {
            revstring+=anystring.charAt(s);
        }

        return  revstring;
    }

}