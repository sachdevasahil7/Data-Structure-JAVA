package Design_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer {

    private final List<Integer> tempHistory;
    private final List<Integer> humidityHistory;
    private final Subject weatherStation;
    public ForecastDisplay(Subject weatherStation) {
        tempHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        this.weatherStation=weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        this.tempHistory.add(weatherStation.getTemp());
        this.humidityHistory.add(weatherStation.getHumidity());
        display7DayHistory();
    }

    public void display7DayHistory() {
        //Print Last 7 days History of Temperature and Humidity
        System.out.println("Temperature History: " +
                tempHistory.subList(Math.max(tempHistory.size() - 7, 0), tempHistory.size()));
        System.out.println("Humidity History: " +
                humidityHistory.subList(Math.max(humidityHistory.size() - 7, 0), humidityHistory.size()));

    }
}