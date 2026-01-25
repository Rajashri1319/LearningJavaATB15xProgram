package OOPs_concept;
//Create a Tester class and object

public class Tester                                   // defined class tester
{
    String name;                                     //Defined instance variable
    int experience;                                  //Defined instance variable

    // Method to display tester details
    void DisplayDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Year of experience is :"+experience);
    }
    //main Method
    public static void main(String[] args) {
        // Creating object of Tester class
        Tester T1 = new Tester();
        // Assigning values to object variables
        T1.name = "Rajashri";
        T1.experience = 4;

        // Calling method using object
        T1.DisplayDetails();


    }
}
