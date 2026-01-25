package OOPs_concept;
//Program 1: Student Details

public class Student1 {
    // Instance variables
    String name;
    int Roll_No;
    // Method to display student information
    void Display_info()
    {
        System.out.println("The name of student is :"+name);
        System.out.println("Roll no :"+Roll_No);

    }
    public static void main(String[] args) {
        // Creating object of Student1 class
        Student1 S1 = new Student1();
        // Assigning values to object variables
        S1.name = "Gaurav";
        S1.Roll_No = 22;
        // Calling method using object
        S1.Display_info();

    }
}
