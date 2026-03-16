package work4.Strategy;
/**
 * Клас **Конкретної Стратегії** (Concrete Strategy).
 * Реалізує алгоритм сортування "бульбашкою".
 */
public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] data, boolean ascending) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && data[j] > data[j + 1]) || (!ascending && data[j] < data[j + 1])) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
