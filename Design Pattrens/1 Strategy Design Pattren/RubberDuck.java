public class RubberDuck extends Duck
{
    RubberDuck()
    {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quacks();
    }
    public void display()
    {
        System.out.println("I am rubber duck");
    }
}
