public class WeatherStation 
{
     public static void main(String[] args) 
    {
        WeatherData weatherData=new WeatherData();
        
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.SetMeasurements(90, 60, 50);
        

    }
}