package work4.Strategy;
/**
 * Клас **Конкретної Стратегії** (Concrete Strategy).
 * Реалізує алгоритм сортування "вибіркою".
 */
public class SelectionSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] data, boolean ascending) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minMaxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending ? (data[j] < data[minMaxIdx]) : (data[j] > data[minMaxIdx])) {
                    minMaxIdx = j;
                }
            }
            int temp = data[minMaxIdx];
            data[minMaxIdx] = data[i];
            data[i] = temp;
        }
    }
}
