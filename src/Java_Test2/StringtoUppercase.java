package Java_Test2;
import java.util.Scanner;
public class StringtoUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====String to Uppercase====");
        // Get input string from user
        System.out.println("Enter the String :");
        String input=scanner.nextLine();
        String uppercase = input.toUpperCase();

        System.out.println("\n The Original string :"+ input + "\"");
        System.out.println("/n Uppercase :"+ uppercase + "\"");
        scanner.close();
    }
}
