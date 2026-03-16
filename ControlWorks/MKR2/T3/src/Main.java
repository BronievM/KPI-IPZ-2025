import mkr.*;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LoggingModule logger = new LoggingModule();
        UserInterface ui = new UserInterface();

        eventManager.subscribe(logger);
        eventManager.subscribe(auth);
        eventManager.subscribe(ui);

        auth.login("admin", true);
        auth.login("h4ck3r", false);
        auth.logout("admin");

        eventManager.notify("SYSTEM_SHUTDOWN", "User pressed power button");
    }
}