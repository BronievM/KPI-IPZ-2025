package work6;

/**
 * Інтефейс оголошення фабричного методу createIterator()
 */
public interface IntegerList {
    /** Метод для додавання елементів у список
     * @param integer Число, яке додається
     **/
    void add(int integer);
    /** Метод для видалення елементу з списку
     * @param integer Число, яке видаляється
     **/
    void remove(int integer);
    /** Метод, який повертає елемент за індексом
     * @param index Індекс елемента, який повертається
     **/
    int get(int index);
    /** Повертає кількість елементів у списку **/
    int size();
    /** Фабричний метод, що повертає об’єкт ітератора**/
    Iterator createIterator();
}
