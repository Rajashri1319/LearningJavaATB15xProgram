package Constructor;

public class Testcase {
    String testcaseuser;
    String testcasedescription;

    Testcase(String testcaseuser, String testcasedescription) {
        this.testcaseuser = testcaseuser;
        this.testcasedescription = testcasedescription;
    }

    void execute() {
        System.out.println("Testuser :" + testcaseuser);
        System.out.println("Test Description : " + testcasedescription);
        System.out.println("Test executed successfully");
    }

    public static void main(String[] args) {
        Testcase TS1 = new Testcase("Rajashri", "Successful");
        TS1.execute();
        Testcase TS2 = new Testcase("Gaurav", "successful");
        TS1.execute();
        Testcase TS3 = new Testcase("Saurav", "failure");
        TS1.execute();
    }
}
