package OOPs_concept;
//Resolve variable confusion using this.

public class Person {                                //Define a class named Person
    String name;                                     //Defined instance variable
    Person(String namegiven){                             //Constructor name = class name Takes one parameter called name This parameter has the same name as instance variable
        this.name=namegiven;                              //“Assign the parameter name to the current object’s name variable.”
    }
    public static void main(String[] args) {
        Person p = new Person("QA Engineer");              //Creates Person object2️⃣ Calls constructor3️⃣ Passes "QA Engineer" as parameter4️⃣ Executes this.name = name;
        System.out.println(p.name);                              //Accesses instance variable using object Prints stored value
    }

}
