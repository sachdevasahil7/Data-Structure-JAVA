package Design_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject { //this class implements observable interface
    private final List<Observer> observers; //maintaining list of observers
    private int temp;
    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int observerIndex = observers.indexOf(o); //Do I have this observer?
        if (observerIndex >= 0) {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update());
    }

    @Override
    public void setHumidity(int humidity) {
        this.humidity=humidity;
    }


    @Override
    public int getHumidity() {
        return humidity;
    }

    @Override
    public void setTemp(int temp) {
    this.temp=temp;
    }

    @Override
    public int getTemp() {
        return temp;
    }

    @Override
    public void measurementsChanged(int temp, int humidity) {
        setHumidity(humidity);
        setTemp(temp);
        notifyObservers();
    }
}