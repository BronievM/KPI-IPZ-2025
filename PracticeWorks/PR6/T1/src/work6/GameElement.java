package work6;

/**
 * Абстрактний базовий клас для всіх об'єктів ігрового простору.
 * Реалізує патерн Composite (предок для груп) і Prototype (дозволяє копіювати)
 */
public abstract class GameElement {
    /**
     * Назва ігрового об'єкта
     */
    protected String name;

    /**
     * Конструктор для створення базового ігрового елементу
     * @param name початкова назва елементу
     */
    public GameElement(String name) {
        this.name = name;
    }

    /**
     * Метод виведення імені для ігрового елементу
     * @return рядок з назвою
     */
    public String getName() {
        return name;
    }

    /**
     * Метод встановлення імені для ігрового елементу
     * @param name нова назва
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
    * Метод виведення інформації про частину
     *@param indent рядок відступу для гарного форматування дерева (наприклад, "  ")
     **/
    public abstract void display(String indent);

    /**
     * Метод поверхневого копіювання
     * @return новий об'єкт, що є поверхневою копією поточного
     */
    public abstract GameElement clone();

    /**
     * Метод глибокого копіювання
     * @return новий об'єкт, що є повною незалежною копією поточного
     */
    public  abstract  GameElement deepClone();

}
