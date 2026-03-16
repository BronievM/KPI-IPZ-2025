package work6;
/**
 * Листовий елемент ігрового простору.
 */
public class GameUnit extends GameElement{
    public GameUnit(String name)
    { super(name); }

    @Override
    public void display(String indent) {
        System.out.println(indent + "| Unit | " + name);
    }

    @Override
    public GameElement clone() {
        return new GameUnit(this.name);
    }

    @Override
    public GameElement deepClone() {
        return new GameUnit(this.name);
    }
}
