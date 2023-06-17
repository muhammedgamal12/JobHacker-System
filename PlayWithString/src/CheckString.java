import java.util.Arrays;
import java.util.Scanner;

public class CheckString {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Add a Understandable Sentence");
        String newstring = sc.nextLine();
        System.out.println("Please select a part you want to see how often it occurs ");
        String word = sc.nextLine();

        System.out.println(checkWordOccurance(newstring,word));
        System.out.println(checkOccuranceOfTheWord(newstring,word));

    }

    // first way of check occurence of specifid word in a string
    public static int checkWordOccurance(String s , String w){
        int count=0;

        if (s.contains(w))
        {
            String [] words = s.split(w);
            if (words.length==1)
                count = 1;
            else
                count = words.length-1;
        }


        return count;
    }

    //second Way
    public static int checkOccuranceOfTheWord(String text , String word){
     int count = 0;

     while (text.contains(word)) {
         text = text.substring(text.indexOf(word)+1,text.length()-1);
         count++;

     }

     return count;
     }
}
