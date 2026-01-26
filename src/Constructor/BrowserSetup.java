package Constructor;

public class BrowserSetup {
    // Instance Variable
    String BrowserName;
    //Default Constructor

    BrowserSetup() {
        BrowserName = "Chrome";
        System.out.println("Browser setup done");
    }
    void LaunchBrowser() {
        System.out.println("Launching Browser " + BrowserName);
    }
    public static void main(String[] args) {
        BrowserSetup BS1 = new BrowserSetup();
        BS1.LaunchBrowser();                     // Calling method
    }

     }

