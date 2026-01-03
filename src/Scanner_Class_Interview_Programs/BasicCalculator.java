package Scanner_Class_Interview_Programs;
import java.util.Scanner;

public class BasicCalculator
{
    static void main(String[] args)
    {
      Scanner scaneer = new Scanner(System.in);
        System.out.println("Enter the first number");
        long num1 = scaneer.nextLong();
        System.out.println("Enter the second number");
        long num2 = scaneer.nextLong();
        System.out.println("Enter the operator (+ , - , * ,  / , % ): ");
        char operator = scaneer.next().charAt(0);

        double results;
        switch(operator) {
            case '+':
                results = num1 + num2;
                System.out.println("Results = :" + results);
                break;

            case '-':
                results=num1-num2;
                System.out.println("Results = "+results);
                break;

            case'*':
                results = num1*num2;
                System.out.println("Results = "+results);
                break;

            case '/':
                if (num2 != 0) {
                    results = num1 / num2;
                    System.out.println("Result = " + results);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        scaneer.close();
    }
    }


