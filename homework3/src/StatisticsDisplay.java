public class StatisticsDisplay implements WeatherDataObserver {
    private float temperatureSum ;
    private float humiditySum ;
    int countTemp ;
    int countHum;
    @Override
    public void update(float temperature, float humidity) {
        temperatureSum+=temperature;
        countTemp++;

        humiditySum+=humidity;
        countHum++;
        display();


    }
    public void display(){
        System.out.println("Avg Temperature = " + (temperatureSum / countTemp) + "°C/");
        System.out.println("Avg Humidity = " + (humiditySum / countHum) + "%/" );

    }
}
