package Functions;
import java.util.Scanner;

public class Return_type_using_String
{
    // Method 1: Handles name greeting
    static String getNameGreeting(String name) {
        return "Hello " + name + "!";
    }

    // Method 2: Handles age message
    static String getAgeMessage(int age) {
        return " You are " + age + " years old.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        String greeting = getNameGreeting(name);
        String ageInfo = getAgeMessage(age);

        System.out.println(greeting + ageInfo);

        // sc.close(); // optional
    }

}
