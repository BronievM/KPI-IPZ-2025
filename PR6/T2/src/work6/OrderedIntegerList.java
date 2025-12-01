package work6;
import java.util.ArrayList;
import java.util.List;

/**
 * конкретна реалізація IntegerList
 **/
public class OrderedIntegerList implements IntegerList {
    private final List<Integer> data;

    /** Базовий конструктор створення списку **/
    public OrderedIntegerList() {
        data = new ArrayList<>();
    }

    @Override
    public void add(int value) {
        int i = 0;
        while (i < data.size() && data.get(i) < value) {
            i++;
        }
        data.add(i, value);
    }

    @Override
    public void remove(int value) {
        data.remove((Integer) value);
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public int get(int index) {
        if (index >= 0 && index < data.size()) {
            return data.get(index);
        }
        System.out.println("Index out of bounds");
        return -1;
    }

    @Override
    public Iterator createIterator() {
        return new OrderedIterator(this);
    }
}
