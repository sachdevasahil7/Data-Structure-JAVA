package Design_Patterns.Observer;

public interface Subject { //this is our observable interface
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    public void setHumidity(int humidity);
    public int getHumidity();
    public void setTemp(int temp);
    public int getTemp();
    void measurementsChanged(int temp, int humidity);

}