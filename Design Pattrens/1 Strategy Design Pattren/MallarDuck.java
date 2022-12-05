public class MallarDuck extends Duck
{
    public MallarDuck()
    {
        quackBehavior=new Quacks();
        flyBehavior=new FlyWithWings();
    }
    public void display()
    {
        System.out.println("I am real mallar duck");
    }
}