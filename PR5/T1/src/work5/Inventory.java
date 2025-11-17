package work5;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас інвентаря. Зберігає список речей персонажа
 */
public class Inventory {
    private List<String> items;

    /**
     * Конструктор для створення пустого інвентаря
     */
    public Inventory() {
        this.items = new ArrayList<>();
    }

    /**
     * Конструктор для копіювання
     * @param other Об'єкт Inventory для копіювання
     */
    public Inventory(Inventory other) {
        this.items = new ArrayList<>(other.items);
    }

    /**
     * Метод-заглушка для додавання предмету.
     * @param item Назва предмету.
     */
    public void addItem(String item) {
        System.out.println("New item in inventory: " + item);
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Inventory: " + String.join(", ", items);
    }
}