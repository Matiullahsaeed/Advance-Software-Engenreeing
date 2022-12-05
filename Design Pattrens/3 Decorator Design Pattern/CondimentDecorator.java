abstract class CondimentDecorator implements IBeverage
{
    protected IBeverage beverage;

    public abstract double Cost();

    public abstract String GetDescription();
}
