package ex_01_Java_Basics;

public class Lab_006_DatatypesPRINTF
{
    static void main()
    {
        byte Age=25;
        short Salary=25000;
        int Employee_ID = 100;
        long Contact_Number = 123456789l;
        float percentage = 88.99f;
        double price = 12345.6789;
        char grade = 'A';
        String Role = "Manual Tester";

        System.out.printf("Age is %d\n", Age);
        System.out.printf("Salary is %d\n", Salary);
        System.out.printf("Employee ID is %d\n", Employee_ID);
        System.out.printf("Contact Number is %d\n", Contact_Number);
        System.out.printf("Percentage is %f\n", percentage);
        System.out.printf("Price is %f\n", price);
        System.out.printf("Grade is %c\n", grade);
        System.out.printf("Role is %s\n", Role);
    }
}

