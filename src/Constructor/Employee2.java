package Constructor;

public class Employee2 {
    String EmployeeName;
    int EmployeeID;

    Employee2(String EmployeeName , int EmployeeID) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
    }

    void DisplayEmployee_Info() {
        System.out.println("Employee : " + EmployeeName);
        System.out.println("Employee ID : " + EmployeeID);
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        Employee2 ED1 = new Employee2("Raj",12345);
        Employee2 ED2 = new Employee2("Rajashri" , 67890);
        ED1.DisplayEmployee_Info();
        ED2.DisplayEmployee_Info();
    }
    }

