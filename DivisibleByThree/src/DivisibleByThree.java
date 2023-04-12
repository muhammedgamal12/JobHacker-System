public class Main {
    public static void main(String[] args) {
        DivisibleBy3();

    }
    public static void DivisibleBy3() {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0)
                System.out.print(number + " & ");
        }
    }
}