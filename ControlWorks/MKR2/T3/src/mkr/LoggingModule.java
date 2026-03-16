package mkr;

public class LoggingModule implements EventListener {
    @Override
    public void update(String eventType, String message) {
        switch (eventType) {
            case "SYSTEM_SHUTDOWN":
                System.out.println("~[LOG] Shutdown! Reason: " + message);
                break;

            default:
                System.out.println("~[LOG] " +  eventType + ": " + message);
                break;
        }
    }
}
