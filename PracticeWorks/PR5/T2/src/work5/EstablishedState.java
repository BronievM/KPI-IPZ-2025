package work5;

/**
 * Конкретний стан "З'єднано" (Established).
 * Дозволяє обмін даними.
 */
public class EstablishedState implements ConnectionState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("[!ERROR]: Connection is already opened");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("[ESTABLISHED] Closing connection...");
        connection.setState(new ClosedState());
        System.out.println(">> State changed: ESTABLISHED -> CLOSED");
    }

    @Override
    public void send(TCPConnection connection, String data) {
        System.out.println("[ESTABLISHED] Sending data: '" + data + "'");
    }

    @Override
    public void receive(TCPConnection connection) {
        System.out.println("[ESTABLISHED] Data received from client");
    }
}