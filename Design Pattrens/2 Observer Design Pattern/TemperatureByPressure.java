public class TemperatureByPressure implements _IObserver,IDisplay
{
    private float temperature;
    private float pressure;
    WeatherData weatherData;
    public TemperatureByPressure(WeatherData weatherData)
    {
        weatherData.RegisterObserver(this);
        this.weatherData = weatherData;
    }
    public void Display()
    {
        System.out.println(temperature + pressure + temperature/pressure) ;
    }
    
    public void Notify()
    {
        this.temperature = weatherData.GetTemperature();
        this.pressure = weatherData.GetPressure();
    }
}
