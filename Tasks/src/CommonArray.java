import java.util.Arrays;

public class Common_Array
{
    public static void main(String[] args)
    {
        int [] arr1={1,5,8,4,6,3};
        int [] arr2={1,5,8,4,5,3};
        int [] new_array=common_members(arr1,arr2);

        for (int i =0 ;i < new_array.length;i++)
        {

            System.out.print(new_array[i] + ",");
        }

    }
    public  static int[] common_members(int []arr1 , int []arr2 )
    {
        int index=0;
    int [] common_array=new int[arr1.length];
    for (int i=0 ; i< arr1.length ; i++)
    {
        for (int k = 0 ;k< arr2.length ; k++)
        {
            if (arr1[i] == arr2[k])
            {
                common_array[index++]=arr1[i];
                break;
            }
        }
    }


        return common_array;
    }

}


