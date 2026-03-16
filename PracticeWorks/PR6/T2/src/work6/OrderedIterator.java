package work6;

/**
 * Реалізація продукту, яка вміє обходити конкретний список
 */
public class OrderedIterator implements Iterator {
    private OrderedIntegerList list;
    private int index = 0;

    /** Базовий конструктор
     * @param list заданий список
     */
    public OrderedIterator(OrderedIntegerList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) return null;
        return list.get(index++);
    }
}
