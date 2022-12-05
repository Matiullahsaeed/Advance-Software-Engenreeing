public class Singleton
{
    private static Singleton singleton;
    private  Singleton(){}

    public static Singleton getInsatance()
    {
        if(singleton==null)
        {
            singleton = new Singleton();

        }
        return singleton;
    }

   public void Print()
   {
     System.out.println("I am Singleton");
   }
}