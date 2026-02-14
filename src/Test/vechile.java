package Test;

class vechile
{
   public void Start()
    {
        System.out.println("Vechile starts");
    }

}
class car extends vechile {
    @Override
    public void Start(){
        System.out.println("Car Engine starts with a roar");
    }
}
class Bike extends vechile
{
    @Override
    public void Start(){
        System.out.println("Bike Engine starts with a purr");
    }

}
class TestVechile{
    public static void main(String[] args) {
        vechile v1 = new car();
        vechile v2 = new Bike();

        v1.Start();
        v2.Start();

    }
}


