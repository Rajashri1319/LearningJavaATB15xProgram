package ex_01_Java_Basics;

public class Averageof5Numbers
{
    static void main(String[] args)
    {
     int num1=10;
     int num2=20;
     int num3=30;
     int num4=40;
     int num5=50;
      // Calculate sum using addition operator

        int sum= num1+num2+num3+num4+num5/5;
        int avg=sum/5;
        System.out.println("The sum :"+sum);
        System.out.println("The average :"+avg);
    }
}
