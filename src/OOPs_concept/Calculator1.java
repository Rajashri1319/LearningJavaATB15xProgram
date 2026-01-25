package OOPs_concept;
//Calculator Using Object

public class Calculator1 {
    void Add(int a , int b) {
        System.out.println("Addition : "+(a + b));
    }
    void Substract(int m , int n){
        System.out.println("Subtraction : " +(m-n));
    }
    public static void main(String[] args) {
        //creating an object using class calculator1
        Calculator1 C1 = new Calculator1();
        // Calling methods using object
        C1.Add(10 , 5);
        C1.Substract(20 , 10);
    }

}
