package Composite;
import java.util.*;

/**
 * Клас, який є композитним елементом
 * Може містити у собі інші GameElement (або інші композити)
 * Використовується для побудови ієрархічних структур сцени
 */
public class CompositeElement extends GameElement {
    /** Список дочірніх елементів */
    private List<GameElement> children =  new ArrayList<GameElement>();
    /**
     * Конструктор.
     * @param name ім'я композитного елемента
     */
    public CompositeElement(String name) { super(name); }
    /**
     * Додає дочірній елемент до композиту.
     * @param child елемент для додавання
     */
    public void addChild(GameElement child) { children.add(child); }
    /**
     * Обчислює загальну площу композитного елемента.
     * Сума площ усіх дочірніх елементів.
     * @return загальна площа
     */
    @Override
    public double getArea() {
        double total = 0;
        for (GameElement el : children) {
            total += el.getArea();
        }
        return total;
    }

    /**
     * Друкує композит і його дочірні елементи.
     * @param indent рядок відступу для форматованого друку
     */
    @Override
    public void print(String indent) {
        System.out.println("+ " + name + " (total area=" + getArea() + ")");
        for (GameElement el : children) {
            el.print(indent + "  ");
        }
    }
}
