public abstract class Duck 
{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    // public Duck() { }
    // public abstract void display();
    
    public void performFly() 
    {
    flyBehavior.Fly();
    }

    public void performQuack() 
    {
    quackBehavior.Quack();
    }

    public void swim() 
    {
    System.out.println("I can swim");
    }
    public void setFlyBehavior(IFlyBehavior fly)
    {
        flyBehavior=fly;
    }
    public void setQuackBehavior(IQuackBehavior quack)
    {
        quackBehavior=quack;
    }

}
