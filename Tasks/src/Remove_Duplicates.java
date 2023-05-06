public class Remove_Duplicates {
    public static void main(String[] args)
    {
        int numbers []={10,54,6,10,33,24,33,11,22,76,7,8,9,12,21,54};
        removeDuplicates(numbers);
    }

    public static int[] removeDuplicates(int[] numbers) {

        int end = numbers.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (numbers[i] == numbers[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        numbers[shiftLeft] = numbers[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] list = new int[end];
        for(int i = 0; i < end; i++){
            list[i] = numbers[i];
            System.out.print(list[i]+" , ");
        }

        return list;
    }
}