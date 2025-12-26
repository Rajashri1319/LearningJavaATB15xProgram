package ex_01_Java_Basics;

public class absolutevalueternary
{
    static void main(String[] args) {
        int num = -25;
        int absvalue = (num < 0) ? -num : num;
        System.out.println("The number is :"+num);
        System.out.println("The absolute value is :"+absvalue);
    }
}
