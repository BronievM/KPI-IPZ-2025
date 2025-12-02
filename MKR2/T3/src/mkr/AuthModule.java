package mkr;

public class AuthModule implements EventListener {
    public void login(String username, boolean isCorrectPassword) {
        EventManager manager = EventManager.getInstance();

        if (isCorrectPassword) {
            System.out.println("[AuthModule]: User " + username + " signed in!");
            manager.notify("LOGIN_SUCCESS", "User " + username);
        } else {
            System.out.println("[AuthModule]: Unsuccessful enter to " + username);
            manager.notify("ACCESS_DENIED", "Password incorrect");
        }
    }

    public void logout(String username) {
        System.out.println("[AuthModule]: User " + username + " signed out");
        EventManager.getInstance().notify("LOGOUT",  username + " signed out");
    }

    @Override
    public void update(String eventType, String message) {
        if (eventType.equals("SYSTEM_SHUTDOWN")) {
            System.out.println("[AuthModule]: Saving sessions before shutting down...");
        }
    }
}
