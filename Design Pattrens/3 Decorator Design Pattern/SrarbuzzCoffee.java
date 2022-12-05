public class SrarbuzzCoffee 
{
    public static void main(String[] args) 
    {
        Beverage beverage = new Espresso();
        // Beverage beverage2 = new HouseBlend();
        // beverage2 = new Mocha(beverage2);
        System.out.println(beverage.GetDescription()
+ " $" + beverage.Cost());
    }

    
}
