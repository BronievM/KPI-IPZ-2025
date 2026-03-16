import Composite.*;
/**
 * Головний клас для демонстрації роботи патерну Composite
 * з ігровими елементами.
 */
public class Main {
    public static void main(String[] args) {
        // Один елемент
        System.out.println(">-- One Element:");
        GameElement tree = new SimpleElement("Tree", 2, 3);
        tree.print(" ");
        // Група з кількох простих елементів
        System.out.println(">-- Group of simple elements:");
        CompositeElement house = new CompositeElement("House");
        house.addChild(new SimpleElement("Wall", 5, 3));
        house.addChild(new SimpleElement("Door", 1, 2));
        house.addChild(new SimpleElement("Window", 1, 1));
        house.print(" ");

        // Багаторівнева структура
        System.out.println(">-- Many levels:");
        CompositeElement level = new CompositeElement("Game Level");
        level.addChild(tree);
        level.addChild(house);

        CompositeElement forest = new CompositeElement("Dark Forest");
        forest.addChild(new SimpleElement("Bush", 1, 1));
        forest.addChild(level);

        forest.print("");
    }
}