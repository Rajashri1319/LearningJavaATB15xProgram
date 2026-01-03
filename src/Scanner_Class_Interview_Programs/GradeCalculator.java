package Scanner_Class_Interview_Programs;
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double percentage = (total / 500.0) * 100;

        char grade;

        if (percentage >= 90) {
            grade = 'A';   // A+
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            grade = 'A';
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            grade = 'B';
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            grade = 'C';
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            grade = 'D';
            System.out.println("Grade: D");
        } else {
            grade = 'F';
            System.out.println("Grade: Fail");
        }

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}