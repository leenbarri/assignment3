public class Main {
    public static void main(String[] args) {
        WeatherDataSubject weatherData = new WeatherDataSubject();
        CurrentConditionsDisplay current = new CurrentConditionsDisplay();
        weatherData.addObserver(current);
        StatisticsDisplay sta = new StatisticsDisplay();
        weatherData.addObserver(sta);
        weatherData.setData(10,30);
        weatherData.setData(79,77);
        weatherData.removeObserver(current);

    }
}