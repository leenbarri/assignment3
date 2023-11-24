import java.util.ArrayList;
import java.util.List;
public class WeatherDataSubject {
    private List<WeatherDataObserver> observers;
    private float temperature;
    private float humidity;
    public WeatherDataSubject() {
        observers = new ArrayList<>();
    }
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
    public void addObserver(WeatherDataObserver ob) {
        observers.add(ob);
    }
    public void removeObserver(WeatherDataObserver ob) {
        observers.remove(ob);
    }
    public void notifyObservers() {


        for (WeatherDataObserver observer : observers) {
            observer.update(temperature, humidity);
        }
    }
    public void Changed() {
        notifyObservers();
    }
    public void setData(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }


}


