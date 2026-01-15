package Functions;
import java.util.Scanner;

public class EvenOddCheck {

    // Void function to check even or odd
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkEvenOdd(num);

        // sc.close(); // optional
    }
}
