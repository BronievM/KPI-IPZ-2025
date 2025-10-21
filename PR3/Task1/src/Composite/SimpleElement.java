package Composite;

/**
 * Клас "Листок", який немає підлеглих
 * Використовується для простих об'єктів у системі
 */
public class SimpleElement extends GameElement {
    private double width;
    private double height;

    /**
     * Конструктор.
     * @param name ім'я елемента
     * @param width ширина елемента
     * @param height висота елемента
     */
    public SimpleElement(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    /**
     * Обчислює площу елемента.
     * @return площа (width * height)
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Друкує інформацію про елемент.
     * Формат: "- name (width x height, area=...)".
     * @param indent рядок відступу для форматованого друку
     */
    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + width + "x" + height +
                "=" + getArea() + ")");
    }
}
