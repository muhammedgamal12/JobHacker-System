import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromWeb {
    public static void main(String [] args) throws Exception {

        File file =new File("Scores.txt");
     readFromWebToFile("http://liveexample.pearsoncmg.com/data/Scores.txt",file);
     writeInFile(file);

    }
    public static void readFromWebToFile(String weburl, File file) throws IOException, MalformedURLException {
        URL url =new URL(weburl);
        Scanner sc = new Scanner(url.openStream());
        PrintWriter writer = new PrintWriter(file);
        while (sc.hasNext()){

            writer.println(sc.nextLine());
        }
        sc.close();
        writer.close();
    }

    public static int getSum(File file) throws FileNotFoundException {
        int total = 0;
        if(file.exists()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                total += sc.nextInt();
            }
            sc.close();
        }
        else {
            System.out.println(file + " not exist");
        }
        return total;
        }

    public static int getAverage(File file) throws Exception {
        int total = 0;
        int average = 0;
        if(file.exists()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                total += sc.nextInt();
            }
            sc.close();
            average = total;
        }

        else {
            System.out.println(file + " not exist");
        }
        return average;
    }
   /* reads the values from the file and print
    the sum and average of the values inside the file */
    public  static void writeInFile(File file) throws Exception {

        FileWriter fileWriter =new FileWriter(file,true);
        PrintWriter writer =new PrintWriter(fileWriter);
        writer.println("Sum = "+getSum(file));
        writer.write("Average = "+getAverage(file));
        writer.close();

    }
}
