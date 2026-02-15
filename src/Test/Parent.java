package Test;

class Parent {
    void display(){
        System.out.println("Parent class displays method");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child class displays  method");
    }
}
class main3{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();
        Child c1 = new Child();
        c1.display();
    }
}