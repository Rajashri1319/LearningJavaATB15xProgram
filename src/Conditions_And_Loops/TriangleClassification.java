package Conditions_And_Loops;
import java.util.Scanner;
public class TriangleClassification
{
    static void main(String[] args)
    {
        System.out.println("Enter the value of side1");
        Scanner scanner = new Scanner(System.in);
        int side1= scanner.nextInt();
        System.out.println("Enter the value of side2");
        int side2= scanner.nextInt();
        System.out.println("Enter the value of side3");
        int side3= scanner.nextInt();
        if (side1 == side2 && side2== side3)
        {
            System.out.println("The Triangle is equilateral ");
        }
        else if(side1== side2 || side2 ==side3 ||side1==side3)
        {
            System.out.println("The Triangle is  isosceles");
        }
          else
        {
        System.out.println("The Triangle is scalene");

        scanner.close();
        }
    }
}
