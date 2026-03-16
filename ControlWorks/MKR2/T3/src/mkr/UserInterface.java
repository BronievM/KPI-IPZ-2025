package mkr;

public class UserInterface implements EventListener {
    @Override
    public void update(String eventType, String message) {
        switch (eventType) {
            case "LOGIN_SUCCESS":
                System.out.println("[UI] >> Welcome!");
                break;

            case "ACCESS_DENIED":
                System.out.println("[UI] >> {!} Access denied! Reason: " + message);
                break;

            case "LOGOUT":
                System.out.println("[UI] >> Goodbye! (Message: " + message + ")");
                break;

            case "SYSTEM_SHUTDOWN":
                System.out.println("[UI] >> Shutting down......");
                break;

            default:
                break;
        }
    }
}
