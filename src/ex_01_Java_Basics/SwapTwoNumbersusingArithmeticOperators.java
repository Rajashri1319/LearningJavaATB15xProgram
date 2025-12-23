package ex_01_Java_Basics;

public class SwapTwoNumbersusingArithmeticOperators
{
    static void main(String[] args) {
        int a=10;
        int b=20;
         //how to swap two numbers WITHOUT using a third variable
        System.out.println("Before Swap :");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
          //After Swap
        a=a+b;  //a=10+20 now a=30
        b=a-b;  //b=30-20 now b=10
        a=a-b;  //a=30-10 now a=20
        System.out.println("After Swap ");
        System.out.println("a :"+a);
        System.out.println("b :"+b);


    }
}
