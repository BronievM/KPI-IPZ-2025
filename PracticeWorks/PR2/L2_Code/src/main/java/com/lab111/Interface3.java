package main.java.com.lab111;

/**
 * Інтерфейс {@code Interface3} демонструє приклад наслідування інтерфейсів.
 * Інтерфейс {@code Interface3} розширює {@link Interface1},
 * додаючи власний метод {@link #meth3()}.
 */
public interface Interface3 extends Interface1 {
    /**
     * Базовий метод інтерфейсу {@code Interface3}.
     * Має бути реалізований у класах, що реалізують цей інтерфейс.
     */
    void meth3();
}