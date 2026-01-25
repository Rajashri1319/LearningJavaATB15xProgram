package OOPs_concept;
 //Pass value to constructor and print it.

public class Employee {                                //You are defining a class named Employee
    String name;                                      //name is an instance variable
    Employee(String n){                               //Constructor name = class name (Employee) It takes one parameter n When object is created, value is passed here
        name = n;

    }
    public static void main(String[] args) {
        Employee e = new Employee("Rajashri");      //Creates an object of Employee2️⃣ Calls constructor automatically3️⃣ Passes "Rajashri" to constructor4️⃣ name gets value "Rajashri"
        System.out.println(e.name);                    //Accesses instance variable using object Prints stored value
    }
}
