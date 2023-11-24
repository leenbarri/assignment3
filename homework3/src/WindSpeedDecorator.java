public class WindSpeedDecorator  extends WeatherDisplayDecorator {
    private WeatherDataObserver ob;
    private float windSpeed;

    public WindSpeedDecorator(WeatherDataObserver weatherDataObserver) {
        super(weatherDataObserver);
    }

    public void update(float temperature, float humidity) {
        super.update(temperature, humidity);
        displayWindSpeed();
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void displayWindSpeed() {
        System.out.println("Wind Speed: " + windSpeed + " mph");
    }
}

