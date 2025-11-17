package work5;

/**
 * Конкретний стан "Очікування" (Listening).
 * Дозволяє встановити з'єднання, але не передавати дані.
 */
public class ListeningState implements ConnectionState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("[LISTENING] Connection established.");
        connection.setState(new EstablishedState());
        System.out.println(">> State changed: LISTENING -> ESTABLISHED");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[LISTENING] Closing server socket..");
        connection.setState(new ClosedState());
        System.out.println(">> State changed: LISTENING -> CLOSED");
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[!ERROR]: Cannot send data while listening");
    }

    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[!ERROR]: No data received yet (waiting for connection)");
    }
}