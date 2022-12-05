public class TurkeyAdpter implements Duck
{
    Turkey _turkey;

    public TurkeyAdpter (Turkey turkey)
    {
        _turkey = turkey;
    }

    public void fly()
    {
        for(int i=0;i<5;i++)
        {
            _turkey.fly();
        }
    }
    public void quack()
    {
        _turkey.gobble();
    }
}
