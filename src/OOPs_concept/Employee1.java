package OOPs_concept;
//Employee Information

public class Employee1 {                        // Defined class employee
    //Declared instance variable
    String Employee_Name;
    int Employee_ID;
    float Employee_Salary;
    //Define method
    void Show_Employee(){
        System.out.println("Employee Name :"+Employee_Name);
        System.out.println("Employee ID :"+Employee_ID);
        System.out.println("Employee Salary :"+Employee_Salary);

    }
    public static void main(String[] args) {
        // Creating object of Employee1 class
        Employee1 E1 = new Employee1();
        {
            E1.Employee_ID = 12345;
            E1.Employee_Salary = 100000000;
            E1.Employee_Name = "Gaurav";
            E1.Show_Employee();
        }

    }



}
