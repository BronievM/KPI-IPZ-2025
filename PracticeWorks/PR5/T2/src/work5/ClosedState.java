package work5;

/**
 * Конкретний стан "Закрито" (Closed).
 * Забороняє передачу даних, дозволяє лише повторне відкриття
 */
public class ClosedState implements ConnectionState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("[CLOSED] Re-opening port for listening.");
        connection.setState(new ListeningState());
        System.out.println(">> State changed: CLOSED -> LISTENING");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[!ERROR]: Connection is already closed");
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[!ERROR] Cannot send data while connection is closed");
    }

    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[!ERROR] Cannot receive data while connection is closed");
    }
}