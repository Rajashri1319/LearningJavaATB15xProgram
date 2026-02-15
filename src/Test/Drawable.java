package Test;

interface Drawable
{
    public void draw();

}
class Circle1 implements Drawable
{
    @Override
   public void draw(){
        System.out.println("Drawing Circle");
    }

}
class Rectangle1 implements Drawable{
    @Override
    public  void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Main{
public static void main(String[] args) {
    Drawable D1 = new Circle1();
    Drawable D2 = new Rectangle1();

    D1.draw();
    D2.draw();

}
}

