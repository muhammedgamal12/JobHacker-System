import java.util.Scanner;

public class Ascending_Array
{
    public static void main(String[] args)
    {
        int [] ascending_array= new int [100] ;
        int k = 0;
        do
        {
            
            Scanner number =new Scanner(System.in);
            ascending_array[k] = number.nextInt();

            //if you need to end the array press "00"
            if (number.nextInt()==00){break;}

            k++;
        }while (k < ascending_array.length-1);
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
