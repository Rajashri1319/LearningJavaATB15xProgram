package Constructor;

public class AppSetup {
    String Broswer;
    String Enviremnet;

    AppSetup(String Broswer, String enviorment) {
        this.Broswer = Broswer;
        this.Enviremnet = Enviremnet;
    }

    void runtest() {
        System.out.println("The browser used  : " + Broswer);
        System.out.println("Environment is  : " +Enviremnet);
        System.out.println("Test Run Successful");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        AppSetup AP1 = new AppSetup("Chrome", "QA");
        AP1.runtest();
        AppSetup AP2 = new AppSetup("Edge", "PRD");
        AP2.runtest();
    }
}

