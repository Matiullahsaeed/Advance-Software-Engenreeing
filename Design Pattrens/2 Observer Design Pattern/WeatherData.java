import java.util.List;
import java.util.ArrayList;
public class WeatherData implements ISubject
{
   private List<_IObserver> Observers;
   private float temperature;
   private float humidity;
   private float pressure;

    public WeatherData()
    {
        Observers=new ArrayList<_IObserver>();
    }

    public float GetTemperature()
    {
        return this.temperature;
    }

    public float GetHumidity()
    {
        return this.humidity;
    }

    public float GetPressure()
    {
        return this.pressure;
    }

    public void RegisterObserver(_IObserver observer)
    {
      Observers.add(observer);  
    }

    public void RemoveObserver(_IObserver observer)
    {
        Observers.remove(observer);
    }
    
    public void NotifyObserver()
    {
        for (_IObserver _IObserver : Observers) 
        {
         _IObserver.Notify();   
        }
    }

    public void MeasurementChanged()
    {
        NotifyObserver();
    }

    public void SetMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        MeasurementChanged();
    }


}