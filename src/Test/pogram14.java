package Test;

public class pogram14 {

        public static void main(String[] args) {

            try {


                int a = 10;
                int b = 0;
                int result = a / b;


                int num = Integer.parseInt("abc");


                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            }

            catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot divide by zero");
            }

            catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Invalid number format");
            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
            }

            System.out.println("Program continues after exception handling.");
        }
    }


