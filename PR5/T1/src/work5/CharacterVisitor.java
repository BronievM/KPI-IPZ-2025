package work5;

/**
 * Інтерфейс Visitor (Відвідувач)
 * Описує методи для обходу об'єктів
 */
public interface CharacterVisitor {
    /**
     * Метод для відвідування персонажа
     * @param character об'єкт, який ми "відвідуємо"
     */
    void visit(Character character);
}