package work4.Iterator;
/**
 * Інтерфейс Агрегата (Aggregate) або Колекції.
 * Змушує класи, що його реалізують, надавати методи ("фабрики")
 * для створення ітераторів.
 */
public interface IterableCollection {
    /**
     * Створює стандартний ітератор для обходу всіх елементів.
     * @return Новий екземпляр ітератора.
     */
    Iterator createIterator();

    /**
     * Створює ітератор, що обходить лише елементи, які відповідають умові.
     * @param condition Умова для фільтрації.
     * @return Новий екземпляр відфільтрованого ітератора.
     */
    Iterator createFilteredIterator(StringCondition condition);
}
