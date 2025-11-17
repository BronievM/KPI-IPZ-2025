package work5;
import java.util.Stack;

/**
 * Клас, який відповідає за збереження історії гри.
 * Виконує роль Caretaker (Опікуна) у патерні Memento.
 * Дозволяє зберігати стан, повертатись до попереднього (undo) та відмінити зміни (redo)
 */
public class GameHistory {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();
    private final Character character;

    /**
     * Конструктор Опікуна.
     * @param character Персонаж, за яким ведеться нагляд.
     */
    public GameHistory(Character character) {
        this.character = character;
    }

    /**
     * Зберігає поточний стан персонажа в історії
     * Очищує історію Redo.
     */
    public void save() {
        System.out.println("[GameHistory] Saving...");
        undoStack.push(character.save());
        redoStack.clear();
    }

    /**
     * Скасовує останню дію (відновлює попередній стан).
     */
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("[GameHistory] There is no any records (Undo).");
            return;
        }
        redoStack.push(character.save());
        Memento mementoToRestore = undoStack.pop();
        character.restore(mementoToRestore);
        System.out.println("[GameHistory] Undo.");
    }

    /**
     * Повторює скасовану дію (відновлює "майбутній" стан)
     */
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("[GameHistory] There is no any records (Redo).");
            return;
        }
        undoStack.push(character.save());
        Memento mementoToRestore = redoStack.pop();
        character.restore(mementoToRestore);
        System.out.println("[GameHistory] Redo.");
    }
}