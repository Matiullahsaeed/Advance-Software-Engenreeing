public class CurrentConditionDisplay implements _IObserver,IDisplay
{
    private float humidity;
    private float temperature;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.RegisterObserver(this);
    }
    public void Display()
    {
      System.out.println("Current condition:" + temperature + "Humidity:" + humidity);
    }
    public void Notify()
    {
        this.temperature = weatherData.GetTemperature();
        this.humidity = weatherData.GetHumidity();
    }
}
