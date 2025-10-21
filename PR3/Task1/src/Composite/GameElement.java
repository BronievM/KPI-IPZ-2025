package Composite;

/**
*Абстрактний клас Компонент, який використовують інші об'єкти
*призначений для визначення загальних методів для роботи з об'єктами
 **/
abstract public class GameElement {
    /** Ім'я елемента, яке використовується для ідентифікації та друку */
    protected String name;
    /**
     * Конструктор компонента.
     * @param name ім'я елемента
     */
    public GameElement(String name) { this.name = name; }
    /**
     * Повертає ім'я елемента.
     * @return ім'я елемента
     */
    public String getName() { return name; }
    /**
     * Обчислює площу елемента.
     * Для простих елементів це width*height,
     * для композитів — сума площ усіх дочірніх елементів.
     * @return площа елемента
     */
    public abstract double getArea();

    /**
     * Друкує інформацію про елемент із заданим відступом.
     * Для композитів виконується рекурсивний виклик для дочірніх елементів.
     * @param indent рядок відступу для форматованого друку
     */
    public abstract void print(String indent);
}
