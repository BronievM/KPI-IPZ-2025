package main.java.com.lab111;

/**
 * Інтерфейс {@code Interface2} демонструє приклад наслідування інтерфейсів.
 * Інтерфейс {@code Interface2} розширює {@link Interface1},
 * додаючи власний метод {@link #meth2()}.
 */
public interface Interface2 extends Interface1 {
    /**
     * Базовий метод інтерфейсу {@code Interface2}.
     * Має бути реалізований у класах, що реалізують цей інтерфейс.
     */
    void meth2();
}