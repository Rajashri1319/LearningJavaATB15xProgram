package Java_TEST1;
import java.util.Scanner;
public class Explicit_Type_Casting
{
    static void main(String[] args) {
        System.out.println("Program of Explicit Typecasting");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the double value :");
        double doubleValue = scanner.nextDouble();

        int intValue = (int) doubleValue; // Explicit type casting
        System.out.println("The double value is :"+doubleValue);
        System.out.println("The Integer value after Explicit Type Casting is :"+intValue);


    }

}
