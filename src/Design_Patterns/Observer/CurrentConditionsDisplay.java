package Design_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class CurrentConditionsDisplay implements Observer {

    private int temp;
    private int humidity;
    private Subject weatherStation;
    public CurrentConditionsDisplay(Subject weatherStation) {

        weatherStation.registerObserver(this);
        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {
        this.temp = weatherStation.getTemp();
        this.humidity = weatherStation.getHumidity();
        displayCurrent();
    }

    public void displayCurrent() {
        System.out.println("Current Temperature: " + temp);
        System.out.println("Current Humidity: " + humidity);
    }
}