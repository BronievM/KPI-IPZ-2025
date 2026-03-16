package work4.Strategy;
/**
 * Інтерфейс Стратегії (Strategy).
 * Визначає загальний метод для всіх алгоритмів сортування, дозволяючи
 * контексту {@link IntArray} викликати їх однаковим чином.
 */
public interface SortStrategy {
    /**
     * Сортує масив цілих чисел.
     * @param data Масив для сортування.
     * @param ascending {@code true} для сортування за зростанням, {@code false} - за спаданням.
     */
    void sort(int[] data, boolean ascending);
}
