package work4.Iterator;
import java.util.List;

/**
 * Клас Конкретного Ітератора (Concrete Iterator).
 * Реалізує базову логіку послідовного обходу списку рядків.
 */
public class StringIterator implements Iterator {
    protected List<String> list;
    protected int index;

    /**
     * Конструктор, що приймає колекцію для обходу.
     * @param list Колекція, яку потрібно ітерувати.
     */
    StringIterator(List<String> list) {
        this.list = list;
        this.index = 0;
    }

    /**
     * Перевіряє, чи є ще елементи для обходу.
     * @return {@code true}, якщо ітерація має наступний елемент.
     */
    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    /**
     * Повертає наступний елемент в ітерації.
     * @return Наступний елемент.
     */
    @Override
    public String next() {
        return list.get(index++);
    }
}
