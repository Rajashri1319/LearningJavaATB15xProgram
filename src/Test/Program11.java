package Test;

class Program11 {

        int add(int a, int b) {
            int result = a + b;
            System.out.println("Integer addition: " + result);
            return result;
        }


        double add(double a, double b) {
            double result = a + b;
            System.out.println("Double addition: " + result);
            return result;
        }


        int add(int a, int b, int c) {
            int result = a + b + c;
            System.out.println("Three integers addition: " + result);
            return result;
        }
    }

    class main2 {
        public static void main(String[] args) {

            Program11 calc = new Program11();

            calc.add(5, 3);          // int version
            calc.add(2.5, 3.7);      // double version
            calc.add(1, 2, 3);       // three int version
        }
    }

