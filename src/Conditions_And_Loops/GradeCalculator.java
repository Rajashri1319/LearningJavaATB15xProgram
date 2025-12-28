package Conditions_And_Loops;
import java.util.Scanner;
public class GradeCalculator
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int n= scanner.nextInt();
        if(n>=90 && n <=100) {
            System.out.println("The grade is : A");
        }
            else if (n >=80 && n <=89)
        {
            System.out.println("The grade is : B");
        }
        else if (n >=70 && n <=79)
        {
            System.out.println("The grade is : C");
        }
        else if (n >=60 && n <=69)
        {
            System.out.println("The grade is : D");
        }
        else
        {
            System.out.println("The grade is : F");
            scanner.close();
        }

    }

}


