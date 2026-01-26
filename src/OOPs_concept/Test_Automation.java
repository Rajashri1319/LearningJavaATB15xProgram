package OOPs_concept;

public class Test_Automation {
    // Instance variables
    String TesterName;
    String Role;
    String Browser;
    int Experience;
    // Method to display tester details
    void DisplayTester_Info() {
        System.out.println(" Tester Name :" + TesterName);
        System.out.println(" Role :" + Role);
        System.out.println(" Browser :" + Browser);
        System.out.println(" Experience :" + Experience);
        System.out.println("-----------------------------");
    }
    // Method to execute test
   void excecutetest() {
       System.out.println("Executing Test on" + " " + Browser + " " +  "Browser");
       System.out.println();
   }

       //main Method
       public static void main(String[] args) {
           // First object
           Test_Automation TA1 = new Test_Automation();
           TA1.TesterName = "Rajashri Tiwari";
           TA1.Role = "QA Specialist";
           TA1.Experience = 4 ;
           TA1.Browser = "Chrome";
           TA1.DisplayTester_Info();
           TA1.excecutetest();
           // Second Object
           Test_Automation TA2 = new Test_Automation();
           TA2.TesterName = "Gaurav shukla";
           TA2.Role ="QA Manger";
           TA2.Experience = 6;
           TA2.Browser = "Edge";
           TA2.DisplayTester_Info();
           TA2.excecutetest();

    }
}
