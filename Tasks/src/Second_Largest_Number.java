import java.util.Arrays;

public class Second_Largest_Number
{
    public static void main(String[] args)
    {

        int [] number={10,58,1000,45,108,77,154,74,24,89,105,100};
        System.out.println(find_second_largest_number(number));
    }

    public  static int find_second_largest_number(int [] numbers)
    {
        Arrays.sort(numbers);
        return numbers[numbers.length-2];
    }
}
