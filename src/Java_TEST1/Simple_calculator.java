package Java_TEST1;
import java.util.Scanner;


public class Simple_calculator
{
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String Operator;
        int a=  scanner.nextInt();
        System.out.println("Enter the Num1");
        int b = scanner.nextInt();
        System.out.println("Enter the Num2");
        System.out.println("Enter the operator + , - , * , / , %");
        double results;
        char operator= scanner.next().charAt(0);
        switch(operator)
        {
            case '+' :
                results=a+b;
                System.out.println("Addition :");
                break;
            case '-':
                results = a-b;
                System.out.println("Subtraction : ");
                break;
            case'*':
                results=a*b;
                System.out.println("Multiplication :");
                break;
            case '%':
                results=a%b;
                System.out.println("Modulous :");
                break;
            case '/':
                results=a/b;
                System.out.println("Division : ");
                break;

        }
        scanner.close();

    }
}
