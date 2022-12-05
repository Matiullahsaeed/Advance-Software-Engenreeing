public abstract class Pizza
{
    public void prepare()
    {
        System.out.println("It is prepared");
    }

    public abstract void bake();

    public void cut()
    {
        System.out.println("cutting pizza");
    }

    public void box()
    {
        System.out.println("Boxing Pizza");
    }
}