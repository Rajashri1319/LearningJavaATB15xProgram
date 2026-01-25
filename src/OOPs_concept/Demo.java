package OOPs_concept;
 //Use constructor to print message when object is created. (No parameters' constructor)
public class Demo {
    Demo()                          //Default constructor
    {
        System.out.println("Object Created");
    }

    public static void main(String[] args)
    {

        Demo d = new Demo();               //d Declares a reference variable & new Demo() Creates object in memory Calls constructor automatically
    }
}


