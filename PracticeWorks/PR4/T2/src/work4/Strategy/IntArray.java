package work4.Strategy;
import java.util.Arrays;
/**
 * Клас Контексту (Context).
 * Зберігає дані (масив) та посилання на поточну {@link SortStrategy}.
 * Делегує виконання операції сортування об'єкту-стратегії.
 */
public class IntArray {
    private int[] data;
    private SortStrategy strategy;
    private boolean ascending = true;

    /**
     * Конструктор, що ініціалізує масив.
     * @param data Вхідний масив.
     */
    public IntArray(int[] data) {
        this.data = Arrays.copyOf(data, data.length);
    }

    /**
     * Встановлює (або змінює) поточну стратегію сортування.
     * @param strategy Об'єкт-стратегія для використання.
     */
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Встановлює напрямок сортування.
     * @param ascending {@code true} для сортування за зростанням, {@code false} - за спаданням.
     */
    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    /**
     * Виконує сортування, викликаючи метод {@code sort} поточної стратегії.
     */
    public void sort() {
        if (strategy == null) {
            System.out.println("[!] Error: You don't have a Strategy!");
            return;
        }
        strategy.sort(this.data, this.ascending);
    }

    /**
     * Виводить поточний стан масиву на екран.
     */
    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
