package work6;

import java.util.ArrayList;
import java.util.List;

/**
 * Композитний елемент ігрового простору (Composite).
 */
public class GameGroup extends GameElement {
    /** Список дочірніх елементів, що входять до цієї групи */
    private List<GameElement> children = new ArrayList<>();

    public GameGroup(String name) {
        super(name);
    }
    /**
     * Додає новий елемент до складу групи
     * @param gameElement об'єкт, який треба додати
     */
    public void add(GameElement gameElement) {
        children.add(gameElement);
    }

    /**
     * Виводить назву групи усіх нащадків
     * @param indent поточний відступ.
     */
    @Override
    public void display(String indent) {
        System.out.println(indent + "+ [Group]: " + name);
        for (GameElement child : children) child.display(indent + "  ");
    }

    @Override
    public GameElement clone() {
        GameGroup copy = new GameGroup(this.name);
        for (GameElement child : this.children) copy.add(child);
        return copy;
    }

    @Override
    public GameElement deepClone() {
        GameGroup copy = new GameGroup(this.name);
        for (GameElement child : this.children) copy.add(child.deepClone());
        return copy;
    }
}
