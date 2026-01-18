package Java_Test2;
import java.util.Scanner;
public class Check_String_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Check string length===");
        System.out.println("Enter the String :");
        String input = scanner.nextLine();

        int length=input.length();    // Get the length of the string
        System.out.println("/n String=" +input + "\" ");
        System.out.println("/n Length=" + length + "\"");    // Display the length
        if(length > 10)
        {
            System.out.println("Length is greater than 10");

        }else {
            System.out.println("Length is less than 10");
        }
        scanner.close();
    }
}
