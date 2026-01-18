package Java_Test2;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Reverse String program===");

        // Get input string from user
        System.out.println("Enter the String :");
        String string1 = scanner.nextLine();

        // Reverse the string using a loop
        String reversed = reverseUsingLoop(string1);

        // Display the results
        System.out.println("original String:" + string1);
        System.out.println("reversed String :" + reversed);
        scanner.close();
    }

    public static String reverseUsingLoop(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}



