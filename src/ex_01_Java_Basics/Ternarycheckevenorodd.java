package ex_01_Java_Basics;

public class Ternarycheckevenorodd
{
    static void main(String[] args) {
        int num=7;
        String results = (num%2==0) ? "even" : "odd";
        System.out.println("number is :"+num);
        System.out.println("The number is "+results);

    }
}
