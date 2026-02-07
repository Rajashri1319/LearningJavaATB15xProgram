package ENUM;

enum Browser {
    CHROME,
    FIREFOX,
    EDGE
}

public class demo11 {

    public static void main(String[] args) {

        Browser selectedBrowser = Browser.CHROME;
        System.out.println("Running tests on: " + selectedBrowser);

        Browser selectedBrowser2 = Browser.FIREFOX;
        System.out.println("Running Second Test on :"+ selectedBrowser2);

        Browser slecetdBrowser3 = Browser.EDGE;
        System.out.println("Runnung Third Test on :"+slecetdBrowser3);
    }
}
