package work5;

/**
 * Інтерфейс стану з'єднання (State).
 * Визначає методи, які мають реалізовувати конкретні стани
 */
public interface ConnectionState {
    /**
     * Метод для відкриття з'єднання.
     * @param connection Контекст (з'єднання, що змінює стан)
     */
    void open(TCPConnection connection);

    /**
     * Метод для закриття з'єднання
     * @param connection Контекст
     */
    void close(TCPConnection connection);

    /**
     * Метод для надсилання даних
     * @param connection Контекст
     * @param data Дані для відправки
     */
    void send(TCPConnection connection, String data);

    /**
     * Метод для отримання даних.
     * @param connection Контекст
     */
    void receive(TCPConnection connection);
}