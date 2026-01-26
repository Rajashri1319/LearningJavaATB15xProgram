package Constructor;

public class Login_Test {
    String Username;
    String Password;
    // Parameterized Constructor

    Login_Test(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    void executetest() {
        System.out.println("Login Test executed for user" + " " + Username);
    }

    public static void main(String[] args) {
        // Creating objects with different data
        Login_Test LT1 = new Login_Test("Rajashri", "Admin1");
        Login_Test LT2 = new Login_Test("Gaurav", "Admin1111");
        LT1.executetest();
        LT2.executetest();
    }
}

