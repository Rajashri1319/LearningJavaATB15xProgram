package Java_TEST1;
import java.util.Scanner;
public class MaximumofTwoNumbers
{
    public static void main(String[] args)
    {
        System.out.println("maximum of two numbers program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number 1 :");
        int num1=scanner.nextInt();
        System.out.println("Enter the number 2 :");
        int num2= scanner.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum of two number is :"+max);

    }
    }

