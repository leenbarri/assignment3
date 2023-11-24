public abstract class WeatherDisplayDecorator implements WeatherDataObserver {
    protected WeatherDataObserver weatherDataObserver;

    public WeatherDisplayDecorator(WeatherDataObserver weatherDataObserver) {
        this.weatherDataObserver = weatherDataObserver;
    }

    public void update(float temperature, float humidity) {
        weatherDataObserver.update(temperature, humidity);
    }
}
