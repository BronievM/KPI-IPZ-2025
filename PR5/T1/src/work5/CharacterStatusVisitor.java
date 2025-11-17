package work5;

/**
 * Конкретний Visitor.
 * Реалізує виведення статистики про персонажа.
 */
public class CharacterStatusVisitor implements CharacterVisitor {

    /**
     * Реалізація операції друку стану персонажа.
     * @param character Персонаж, стан якого потрібно вивести.
     */
    @Override
    public void visit(Character character) {
        System.out.println(">- Character summary (Visitor):");
        System.out.println("- Health level:" + character.getHealthLevel());
        System.out.println("- " + character.getPosition());
        System.out.println("- " + character.getInventory());
    }
}