import work4.Strategy.*;
/**
 * Клієнтський клас для демонстрації патерну Стратегія.
 * Створює контекст {@link IntArray} і динамічно змінює його поведінку (алгоритм сортування)
 * під час виконання програми.
 * @author Broniev
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] initialData = {64, 34, 25, 12, 22, 11, 90};
        String divider = ">----------------------------------------";
        System.out.println(divider);

        IntArray array = new IntArray(initialData);

        System.out.print("Created array: ");
        array.print();
        System.out.println(divider);
        System.out.println("We dont choose any strategy, so.. Class should give us error");
        array.sort();
        System.out.println(divider);

        array.setStrategy(new BubbleSortStrategy());
        System.out.println("Bubble sorted (ascending):");
        array.sort();
        array.print();
        System.out.println(divider);

        array = new IntArray(initialData);
        System.out.print("Array restored: ");
        array.print();
        System.out.println(divider);

        array.setStrategy(new SelectionSortStrategy());
        array.setAscending(false);
        System.out.println("Choosed Selection sort strategy (descending):");
        array.sort();
        array.print();
        System.out.println(divider);

        array = new IntArray(initialData);
        System.out.print("Array restored: ");
        array.print();
        System.out.println(divider);

        array.setStrategy(new BubbleSortStrategy());
        array.setAscending(false);
        System.out.println("Choosed bubble sort (descending):");
        array.sort();
        array.print();
        System.out.println(divider);


    }
}