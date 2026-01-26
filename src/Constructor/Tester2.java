package Constructor;
//First Program: Default Constructor (NO parameters)

public class Tester2 {
    String Name;
    int Experience;

    //Default constructor
    Tester2() {                  //Has same name as the class, no return type ,Is called automatically when an object is created
        Name = "Rajashri";
        Experience = 4;
        System.out.println("Default Constructor called");
    }

    void Display_Info() {
        System.out.println("Name : " + Name);
        System.out.println("Experience :" + Experience);
    }

    public static void main(String[] args)
    //New object created
    {
        Tester2 T2 = new Tester2();          //constructor auto-called
        T2.Display_Info();

    }
}


