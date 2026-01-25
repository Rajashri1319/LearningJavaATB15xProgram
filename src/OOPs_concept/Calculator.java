package OOPs_concept;

 //Create a method and call it using object.

public class Calculator {
    void add()                     // declared method
    {
        int a =10;
        int b= 20;
        System.out.println(a+b);

    }
    public static void main(String[] args)
    {
        Calculator C = new Calculator();             //C Declares a reference variable
        //new Calculator Creates an object in heap memory & Calls default constructor
        C.add();

    }
}
