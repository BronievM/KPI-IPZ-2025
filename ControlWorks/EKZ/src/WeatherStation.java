import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Service service = new ProxyService();
    private String currentData;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(currentData);
        }
    }

    public void work() {
        String newData = service.getData();
        this.currentData = newData;
        notifyObservers();
    }
}
