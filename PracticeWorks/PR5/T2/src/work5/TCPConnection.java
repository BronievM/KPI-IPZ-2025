package work5;

/**
 * Клас, що представляє TCP-з'єднання (Context).
 * Зберігає поточний стан і передає йому виконання операцій
 */
public class TCPConnection {
    private ConnectionState currentState;

    /**
     * Конструктор. Встановлює початковий стан LISTENING
     */
    public TCPConnection() {
        this.currentState = new ListeningState();
        System.out.println("[TCPConnection] Initialized. State: LISTENING");
    }

    /**
     * Метод для відкриття з'єднання.
     */
    public void open() {
        this.currentState.open(this);
    }

    /**
     * Метод для закриття з'єднання.
     */
    public void close() {
        this.currentState.close(this);
    }

    /**
     * Метод для надсилання даних.
     */
    public void send(String data) {
        this.currentState.send(this, data);
    }

    /**
     * Метод для отримання даних.
     */
    public void receive() {
        this.currentState.receive(this);
    }

    /**
     * Дозволяє об'єктам стану змінювати поточний стан Контексту.
     * @param newState Новий стан
     */
    protected void setState(ConnectionState newState) {
        this.currentState = newState;
    }
}
