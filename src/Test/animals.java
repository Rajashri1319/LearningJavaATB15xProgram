package Test;

class animals {
    void Sound() {
        System.out.println("whoo whoo");
    }
}

    class cat extends animals
    {
        void Sound() {
            System.out.println("Dog says :Woof Woof");
        }
    }

        class dog1 extends animals
        {
            void Sound()
            {
                System.out.println("Cat says : Meow Meow");
            }


        public static void main(String[] args)
        {

            animals a = new cat();
            animals d = new dog1();
            a.Sound();
            d.Sound();
        }
    }


