public class TemperatureUnitsDecorator extends WeatherDisplayDecorator {
    public TemperatureUnitsDecorator(WeatherDataObserver weatherDataObserver) {
        super(weatherDataObserver);
    }
    public void update(float temperature, float humidity) {
        temperature = (temperature * 9 / 5) + 32;
        weatherDataObserver.update(temperature, humidity);
    }
}



