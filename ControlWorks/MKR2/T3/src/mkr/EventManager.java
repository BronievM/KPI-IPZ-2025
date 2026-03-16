package mkr;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static EventManager instance;
    private List<EventListener> listeners = new ArrayList<>();

    private EventManager() {
        System.out.println("[System] EventManager initialized!");
    }

    public static EventManager getInstance() {
        if (instance == null) instance = new EventManager();
        return instance;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String eventType, String message) {
        for (EventListener listener : listeners)  listener.update(eventType, message);
    }

}
