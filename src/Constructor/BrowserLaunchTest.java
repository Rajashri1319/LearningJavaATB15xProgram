package Constructor;

public class BrowserLaunchTest {
    //Instance variable
    String BrowserName;
    String URL;

    BrowserLaunchTest(String Browsername, String URL) {
        this.BrowserName = Browsername;
        this.URL = URL;
    }

    void LaunchTest() {
        System.out.println("Launching application");
        System.out.println("Browser : " + BrowserName);
        System.out.println("URL     : " + URL);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        // First test execution
        BrowserLaunchTest BS = new BrowserLaunchTest("Chrome", "www.google.com");
        BS.LaunchTest();
        // Second test execution
        BrowserLaunchTest BS2 = new BrowserLaunchTest("Firefox" ,"www.who.com" );
        BS2.LaunchTest();
    }
}