public class Sorting_Array
{
    public static void main(String[] args) {

        int [] numbers={10,85,45,77,1,99,56,6};

        sorting_array(numbers);
    }

    public static void sorting_array(int [] arr)
    {
        int temp;
     for (int i =0 ;i <= arr.length-1;i++)
     {
         for (int j=i+1;j <= arr.length-1;j++)
         {
             if(arr[i] > arr[j])
             {
                 temp = arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
     for (int k =0;k <= arr.length-1;k++)
     {
         System.out.print(arr[k]+",");
     }

    }
}
