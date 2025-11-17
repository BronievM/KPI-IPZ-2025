package work5;

/**
 * Інтерфейс для елементів, які можуть прийняти Visitor.
 * Його реалізує клас Character.
 */
public interface Visitable {
    /**
     * Стандартний метод accept для патерну Visitor.
     * @param visitor Об'єкт Відвідувача, який виконає операцію.
     */
    void accept(CharacterVisitor visitor);
}