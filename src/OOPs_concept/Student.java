package OOPs_concept;

//Create a class with one variable and print it using an object.

public class Student {                           //Class
    String name;
    public static void main(String[] args){
        Student S = new Student();               // S Declares a reference variable
             //new Student Creates an object in heap memory & Calls default constructor
        S.name = "rajashri";
        System.out.println(S.name);

}

}
