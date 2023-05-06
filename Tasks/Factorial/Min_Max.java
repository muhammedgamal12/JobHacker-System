public class Min_Max
{
    public static void main(String[] args)
    {
        int [] numbers =new int[1000];
        int min = numbers[0];
        int max = numbers[0];

        for ( int i = 0;i < numbers.length; i++)
        {
        numbers[i]=(int) (Math.random()*10000);
        }
       for (int k = 1; k < numbers.length-1;k++ ){
           if(min > numbers[k])
               min = numbers[k];
           if(max < numbers[k])
               max = numbers[k];
       }
        System.out.println(" Minimum number is "+ min );
        System.out.println(" Maximum number is "+ max );


    }
}
