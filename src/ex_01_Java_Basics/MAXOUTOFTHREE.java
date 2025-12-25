package ex_01_Java_Basics;

public class MAXOUTOFTHREE
{
    static void main(String[] args)
    {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);

            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);
            System.out.println("n3 = " + n3);
            System.out.println("Maximum = " + max);
        }
    }



