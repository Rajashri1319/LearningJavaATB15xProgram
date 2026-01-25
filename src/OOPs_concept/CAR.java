package OOPs_concept;
//Multiple variables + single method

public class CAR {
    // Instance variables//Defined Class Car
    String Brand;
    String Color;
    long Price;
    // Method to display car details
    void DisplayCarInfo(){
        System.out.println("Brand :"+Brand);
        System.out.println("Color :"+Color);
        System.out.println("Price :"+Price);
    }
    public static void main(String[] args) {
        // Creating object of Car class
        CAR C1 = new CAR();
        // Assigning values to object variables
        C1.Price = 1000000000;
        C1.Color = "RED";
        C1.Brand = " SEDAN";
        // Calling method using object
        C1.DisplayCarInfo();

    }
}
