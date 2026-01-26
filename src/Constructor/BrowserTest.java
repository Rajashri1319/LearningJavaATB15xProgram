package Constructor;

import OOPs_concept.Browser_Test;

public class BrowserTest {
    String Browsername;
    int Timeout;

    // Default Constructor
    BrowserTest(){
        Browsername = "Chrome";
        Timeout= 30;
    }
    //Parameterized Constructor
    BrowserTest(String Browsername ,int timeout) {
        this.Browsername = Browsername;
        this.Timeout = Timeout;
        System.out.println("Custom browser setup applied");
    }

    void LaunchBrowser() {
        System.out.println("Browser : " + Browsername);
        System.out.println("Timeout : " + Timeout);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        // Using Default Constructor
        BrowserTest test1 = new BrowserTest();
        test1.LaunchBrowser();
        // Using Parameterized Constructor
        BrowserTest test2 = new BrowserTest("Edge" , 60);
        test2.LaunchBrowser();

    }
}
