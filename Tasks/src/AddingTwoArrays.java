import java.util.ArrayList;

public class Adding_TwoArrays
{

    public  static void main (String [] args)
    {
        int [] array1 = {2,5,1,8,4,66};
        int [] array2 = {44,7,1,2,8,0};

        if(array1.length == array2.length)
        print_array(adding_array(array1,array2));

        else
            System.out.println("Please enter two equals arrays");

    }

    public static  ArrayList<Integer> adding_array(int [] arr1, int []arr2)
    {
        ArrayList <Integer> result =new ArrayList();

            for (int i =0 ;i < arr1.length ; i++)
            {
                result.add( arr1[i] + arr2[i]);
            }


        return  result;
    }
    //print array from Integer datatype
    public static void print_array(ArrayList <Integer> the_array) {
        for (int e:the_array) {
            System.out.print(e + ",");
        }
    }
}
