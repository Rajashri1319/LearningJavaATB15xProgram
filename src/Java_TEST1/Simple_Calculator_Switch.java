package Java_TEST1;
import java.util.Scanner;
public class Simple_Calculator_Switch {
    public static void main(String[] args) {
        System.out.println("====Simple Calculator===");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  First number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int num2 = scanner.nextInt();
        int results;
        System.out.println("choose the operation you want to perform(\"+ , - , %, * , / \")");
        char operator = scanner.next().charAt(0);
        switch (operator) {

            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        // sc.close(); // optional
    }
}

