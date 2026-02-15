package Test;

class Outer {

        int x = 10;   // Outer class variable

        // Inner class
        class Inner {

            void display() {
                System.out.println("Inner class accessing outer variable: " + x);
            }
        }

        void showOuter() {
            System.out.println("Outer class variable x: " + x);
        }
    }

 class Main3{
        public static void main(String[] args) {

            Outer outer = new Outer();
            outer.showOuter();

            // Creating Inner class object
            Outer.Inner inner = outer.new Inner();
            inner.display();
        }

}
