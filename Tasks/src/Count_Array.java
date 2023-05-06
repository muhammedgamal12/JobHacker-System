import java.util.Scanner;

public class Count_Array
{


        public static void main(String[] args)
        {
            int [] arr= new int [10] ;
            int k = 0;
            System.out.println("Please Enter a specific value to check how many numbers greater than it");
            Scanner number =new Scanner(System.in);
            int value = number.nextInt();
            do
            {

                System.out.println("Enter a member for the \"Array\"");
                arr[k] = number.nextInt();


                k++;
            }while (k < arr.length);
            System.out.println(check_array(arr,value));
        }
        private  static int check_array(int arr[] , int value)
        {
            int count = 0;
            for (int i =0 ; i <= arr.length-1 ; i++)
            {
                if(arr[i] > value)
                    count ++;
            }


         return  count;
        }

    }
