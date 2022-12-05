public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage) 
    {
        this.beverage = beverage;
    }
 
    public String GetDescription() {
        return beverage.GetDescription() + ", Mocha";
    }


    public double Cost() 
    {
        return beverage.Cost() + .20;
    }
}
