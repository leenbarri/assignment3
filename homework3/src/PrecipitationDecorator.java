public class PrecipitationDecorator extends WeatherDisplayDecorator {
    public PrecipitationDecorator(WeatherDataObserver weatherDataObserver) {
        super(weatherDataObserver);
    }

    public void update(float temperature, float humidity, float pressure) {

        super.update(temperature, humidity);
    }
}
