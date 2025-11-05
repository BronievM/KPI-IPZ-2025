package work4.Iterator;
/**
 * Функціональний інтерфейс, що виступає як "умова" або "фільтр" для рядків.
 * Використовується для передачі логіки фільтрації у {@link FilteredStringIterator}.
 */
public interface StringCondition {
    /**
     * Перевіряє, чи задовольняє рядок умову.
     * @param s Рядок для перевірки.
     * @return {@code true}, якщо умова виконана, інакше {@code false}.
     */
    boolean condition(String s);
}
