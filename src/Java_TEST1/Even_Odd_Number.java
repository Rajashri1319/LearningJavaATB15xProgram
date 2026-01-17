package Java_TEST1;
import java.util.Scanner;
public class Even_Odd_Number {
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("check the number is even or odd");

        System.out.println("Enter the Number : ");
        int num1 = scanner.nextInt();

        if ( num1%2==0) {
            System.out.println("The numbers is even");
        }
            else {
                System.out.println("The number is odd");
            }
        }
    }

