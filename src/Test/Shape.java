package Test;


abstract class Shape {
    public abstract double getarea();

    }

class Rectangle extends Shape{
    float length;
    float width;
    Rectangle(float length , float width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getarea(){
        return length*width;
    }
}
class Circle extends Shape{
    double radius;


    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getarea() {
        return Math.PI * radius * radius;
    }
}
abstract class main {
    public static void main(String[] args) {
        Shape Rectangle  = new Rectangle(5 , 3);
        Shape Circle = new Circle(4);
        System.out.println("Rectangle Area :"+Rectangle.getarea() );
        System.out.println("Circle Area :"+Circle.getarea());

    }

}
