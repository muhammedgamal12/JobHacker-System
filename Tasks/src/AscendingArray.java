import java.util.Scanner;

public class Ascending_Array
{
    public static void main(String[] args)
    {
        int [] ascending_array= new int [5] ;
        int k = 0;
        do
        {

            Scanner number =new Scanner(System.in);
            ascending_array[k] = number.nextInt();


            k++;
        }while (k < ascending_array.length);
        System.out.println(check_array(ascending_array));
    }
    private  static String check_array(int arr[])
    {
        String status = "The array sorted on ascending way";

        for (int i = 0 ; i < arr.length-1 ; i++ )
        {
            if (arr[i] > arr[i+1])
            {
                status = "The array not sorted on ascending way";
            }
        }

        return status;
    }

}
