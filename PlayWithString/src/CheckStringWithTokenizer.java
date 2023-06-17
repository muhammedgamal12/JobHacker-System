import java.util.Scanner;
import java.util.StringTokenizer;

public class CheckStringWithTokenizer {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Add a Understandable Sentence");
        String newstring = sc.nextLine();
        System.out.println("Please select a part you want to see how often it occurs ");
        String word = sc.next();

        System.out.println( checkTokenizer(newstring ,word));


    }

   public static int checkTokenizer(String text ,String word){


       StringTokenizer s =new StringTokenizer(text,word);

       return s.countTokens()-1;
   }
}
