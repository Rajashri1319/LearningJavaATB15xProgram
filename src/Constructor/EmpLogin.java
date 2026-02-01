package Constructor;

import java.sql.SQLOutput;

public class EmpLogin {
    String UserName;
    String role;
     EmpLogin(String UserName , String role) {
         this.UserName = UserName;
         this.role = role;
     }

     void Login(){
         System.out.println("Employee Login");
         System.out.println("User :"+UserName);
         System.out.println("Role :"+role);
         System.out.println("-------------------------");
     }

     public static void main(String[] args) {
         EmpLogin E1 = new EmpLogin("Raj", "QA");
         E1.Login();

         EmpLogin E2 = new EmpLogin("Rajashri" , "Developer");
         E2.Login();

         }
     }

