import java.awt.geom.Point2D;

public class Consecutive_Elements
{
    public static void main(String [] args) {
        int [] array={1,87,9,11,13,88,89};
        count_consecutive_elements(array);







    }

    public static void count_consecutive_elements(int [] numbers){
        int count = 0;
        for (int i = 0;i< numbers.length;i++)
        {
            for (int k = i+1 ; k< numbers.length; k++)
            {
                if (Math.abs(numbers[i]-numbers[k])==1){
                    count+=1;
                }
            }

        }
        System.out.println(count);

    }

}
