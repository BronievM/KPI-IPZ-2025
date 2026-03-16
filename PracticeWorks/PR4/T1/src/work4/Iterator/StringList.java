package work4.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас Конкретного Агрегата (Concrete Aggregate).
 * Це колекція, що зберігає рядки і реалізує фабричні методи
 * для створення відповідних ітераторів.
 */
public class StringList implements IterableCollection {
    private List<String> data = new ArrayList<>();

    /**
     * Додає новий рядок до колекції.
     * @param s Рядок для додавання.
     */
    public void add(String s){
        data.add(s);
    }

    /**
     * Створює стандартний ітератор для обходу всіх елементів.
     * @return Новий екземпляр ітератора.
     */
    @Override
    public Iterator createIterator(){
        return new StringIterator(data);
    }

    /**
     * Створює ітератор, що обходить лише елементи, які відповідають умові.
     * @param condition Умова для фільтрації.
     * @return Новий екземпляр відфільтрованого ітератора.
     */
    @Override
    public Iterator createFilteredIterator(StringCondition condition) {
        return new FilteredStringIterator(data, condition);
    }
}
