public interface ISubject 
{
    public void RegisterObserver(_IObserver observer);
    public void RemoveObserver(_IObserver observer);
    public void NotifyObserver();
}
