package work4.Iterator;
import java.util.List;

/**
 * Спеціалізований Конкретний Ітератор, який додає логіку фільтрації.
 * Пропускає елементи, що не відповідають заданій умові {@link StringCondition}.
 */
public class FilteredStringIterator extends StringIterator{
    private final StringCondition condition;

    /**
     * Конструктор, що приймає колекцію та умову фільтрації.
     * @param list Колекція для обходу.
     * @param condition Умова для перевірки елементів.
     */
    FilteredStringIterator(List<String> list, StringCondition condition) {
        super(list);
        this.condition = condition;
        moveToNextValid();
    }

    /**
     * Внутрішній метод, що пересуває індекс до наступного елемента,
     * який відповідає умові фільтра.
     */
    private void moveToNextValid() {
        while (index < list.size() && !condition.condition(list.get(index))) {
            index++;
        }
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
        String value = list.get(index++);
        moveToNextValid();
        return value;
    }
}
