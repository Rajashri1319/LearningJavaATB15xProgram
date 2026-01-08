package For_Loop_Programs;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PRINT_NUMBERS {
    static void main(String[] args) {
        System.out.println("===Enter the number from 1 to N===");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++)
        {
            System.out.println(i + " ");
        }
        scanner.close();
    }
}
