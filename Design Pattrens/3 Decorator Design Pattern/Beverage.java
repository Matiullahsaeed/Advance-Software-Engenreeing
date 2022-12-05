abstract class Beverage implements IBeverage
{
    protected String Description = "Unknown beverage";

    public String GetDescription()
    {
        return Description;
    }
    public abstract double Cost();
}