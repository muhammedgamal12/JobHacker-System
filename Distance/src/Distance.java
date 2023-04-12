public class Distance {
    public static void main(String[] args) {

        double x1 = 2;
        double y1 = 7;
        double x2 = 5;
        double y2 = 9;

        double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(String.format("%.4f", Distance));
    }
}