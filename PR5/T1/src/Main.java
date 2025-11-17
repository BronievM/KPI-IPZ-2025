package work5;

/**
 * Головний клас для демонстрації роботи шаблонів Memento та Visitor.
 * @author Broniev
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(">>-- Creating character");
        Position startPos = new Position(0, 0);
        Inventory startInv = new Inventory();
        startInv.addItem("Tasty potato");
        Character player = new Character(startPos, startInv, 100);
        System.out.println("First stat: " + player);

        GameHistory history = new GameHistory(player);
        history.save();

        System.out.println("\n>>-- Changing stats");
        player.move(10, 5);
        player.pickUpItem("Iron sword");
        System.out.println("New stat: " + player);
        history.save();

        System.out.println("\n>>-- Changing stats");
        player.takeDamage(30);
        System.out.println("Stat after damage: " + player);

        System.out.println("\n>>-- Using Memento (Undo)");
        System.out.println("using Undo (before taking damage)...");
        history.undo();
        System.out.println("Returned stats: " + player);

        System.out.println("\nusing second Undo (to the start stats)...");
        history.undo();
        System.out.println("Returned stats: " + player);

        System.out.println("\n>>-- Using Memento (Redo)");
        System.out.println("Using Redo (get back to 'find sword')...");
        history.redo();
        System.out.println("Returned stats: " + player);

        System.out.println("\n>>-- Using Visitor (Adding operation) ---");
        System.out.println("Adding new operation");
        CharacterVisitor statusReportVisitor = new CharacterStatusVisitor();
        player.accept(statusReportVisitor);
    }
}