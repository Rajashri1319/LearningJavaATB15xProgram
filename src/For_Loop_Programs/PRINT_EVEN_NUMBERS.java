package For_Loop_Programs;
import java.util.Scanner;
public class PRINT_EVEN_NUMBERS
{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==Program to print even numbers");

        for(int i=1 ; i<=50 ; i++){
            if(i%2==0){
                System.out.println("Even -->"+i);
            }
            else{
                System.out.println("Odd -->"+i);
            }
        }

    }

}
