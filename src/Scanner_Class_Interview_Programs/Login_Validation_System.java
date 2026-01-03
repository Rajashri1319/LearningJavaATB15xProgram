package Scanner_Class_Interview_Programs;
import java.util.Scanner;

public class Login_Validation_System {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        for (int attempt = 1; attempt <= 3; attempt++) {


            System.out.println("Enter the username :");
            String username = scanner.nextLine();

            System.out.println("Enter the password :");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login succesfull");
                break;

            } else {
                System.out.println("Invalid Credentials");
            }

            if (attempt < 3) {
                System.out.println("Attempt left :" + (3 - attempt));
            } else {
                System.out.println("Account locked. Too many failed attempts.\"");
            }
        }
    }
}




