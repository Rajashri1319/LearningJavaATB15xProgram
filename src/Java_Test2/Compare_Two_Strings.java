package Java_Test2;
import java.util.Scanner;
public class Compare_Two_Strings {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("====Comparing Two Strings====");
        System.out.println("Enter the String 1 :");
        String string1=scanner.nextLine();
        System.out.println("Enter the string 2 :");
        String string2= scanner.nextLine();
        // Display the strings

        System.out.println("\nString Comparison--------");
        System.out.println("\nString1 : \"" + string1 +"\"");
        System.out.println("\nString2 : \"" + string1 +"\"");

        // Compare strings using equals() method
        boolean areEqual = string1.equals(string2);

        // Display the result
        if(areEqual) {
            System.out.println("The String1 & String2 are Equal");
        }else{
            System.out.println("The String1 & String2 are not Equal");


            // Additional comparison: case-insensitive
            boolean areEqualIgnoreCase = string1.equalsIgnoreCase(string2);
            System.out.println("\n--- Case-Insensitive Comparison ---");
            if (areEqualIgnoreCase) {
                System.out.println("Result: The strings are equal (ignoring case)");
            } else {
                System.out.println("Result: The strings are not equal (even ignoring case)");
            }
            scanner.close();

        }


    }
}
