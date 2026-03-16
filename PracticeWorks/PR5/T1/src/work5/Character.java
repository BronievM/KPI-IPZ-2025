package work5;

/**
 * Основний клас персонажа.
 * У патерні Memento виступає як Originator.
 * У патерні Visitor виступає як ConcreteElement.
 */
public class Character implements Visitable {
    private Position position;
    private Inventory inventory;
    private int healthLevel;

    /**
     * Конструктор персонажа
     * @param position Початкова позиція
     * @param inventory Початковий інвентар
     * @param healthLevel Початковий рівень здоров'я
     */
    public Character(Position position, Inventory inventory, int healthLevel) {
        this.position = position;
        this.inventory = inventory;
        this.healthLevel = healthLevel;
    }

    /**
     * Метод зміни позиції персонажа
     * @param newX Нова координата X
     * @param newY Нова координата Y
     */
    public void move(int newX, int newY) {
        System.out.println("Moving to x=" + newX + " y=" + newY);
        this.position.setX(newX);
        this.position.setY(newY);
    }

    /**
     * Метод підбору артефакту гравцем
     * @param item Назва артефакту
     */
    public void pickUpItem(String item) {
        System.out.println("Picked item: " + item);
        this.inventory.addItem(item);
    }

    /**
     * Метод отримання шкоди гравцем
     * @param amount Кількість шкоди
     */
    public void takeDamage(int amount) {
        System.out.println("Damage taken: " + amount);
        this.healthLevel -= amount;
    }

    /**
     * Клас Memento
     * Внутрішній приватний клас, що реалізує знімок стану
     */
    private static class CharacterMemento implements Memento {
        private final Position savedPosition;
        private final Inventory savedInventory;
        private final int savedHealth;

        /**
         * Приватний конструктор, який викликається лише методом save() класу Character
         */
        private CharacterMemento(Position posToSave, Inventory invToSave, int healthToSave) {
            this.savedPosition = new Position(posToSave);
            this.savedInventory = new Inventory(invToSave);
            this.savedHealth = healthToSave;
        }

        private Position getSavedPosition() { return savedPosition; }
        private Inventory getSavedInventory() { return savedInventory; }
        private int getSavedHealth() { return savedHealth; }
    }

    /**
     * Створює знімок поточного стану персонажа
     * @return Об'єкт Memento, що містить копію стану
     */
    public Memento save() {
        System.out.println(">> Character.save() -> Saved");
        return new CharacterMemento(this.position, this.inventory, this.healthLevel);
    }

    /**
     * Відновлює стан персонажа із вказаного знімка
     * @param memento Об'єкт Memento, з якого відновлюється стан
     */
    public void restore(Memento memento) {
        CharacterMemento m = (CharacterMemento) memento;
        this.position = m.getSavedPosition();
        this.inventory = m.getSavedInventory();
        this.healthLevel = m.getSavedHealth();
        System.out.println(">> Character.restore() -> Restored!");
    }

    @Override
    public void accept(CharacterVisitor visitor) {
        System.out.println(">> Character.accept() -> Visitor allowed to visit me");
        visitor.visit(this);
    }

    /**
     * Повертає поточну позицію
     * @return Поточна позиція
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Повертає поточний інвентар
     * @return Поточний інвентар
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Повертає поточний рівень здоров'я
     * @return Поточний рівень здоров'я
     */
    public int getHealthLevel() {
        return healthLevel;
    }

    /**
     * Стандартний метод для виводу поточної статистики персонажа.
     */
    @Override
    public String toString() {
        return "Character [Health=" + healthLevel + ", " + position + ", " + inventory + "]";
    }
}
