package Functions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum_Two_Numbers {
    static int addnum(int a, int b) {
        int sum = a + b;
        return sum;


    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1=");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2=");
        int num2 = scanner.nextInt();

        int results = addnum(num1, num2);
        System.out.println("Sum :" + results);
    }

}
