package Java_TEST1;
import java.util.Scanner;
public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
       String results = (num>0) ? "Positive"
               : (num<0) ? "Negative"
               : "Zero";
        System.out.println("the number is :"+results);
    }
}
