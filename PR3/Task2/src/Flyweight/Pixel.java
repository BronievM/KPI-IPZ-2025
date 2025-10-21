package Flyweight;

/**
 * Клас, що представляє піксель.
 * Реалізує патерн Flyweight — зберігає стан спільного використання (color),
 * а координати передаються при малюванні.
 */
public class Pixel implements GraphicObject {
    /** Колір пікселя (спільний стан) */
    private final String color;
    /**
     * Конструктор.
     * @param color колір пікселя
     */
    public Pixel(String color) { this.color = color; }

    /**
     * Малює піксель у вказаних координатах.
     * @param x координата по горизонталі
     * @param y координата по вертикалі
     */
    @Override
    public void draw(int x, int y) { System.out.println("Pixel at (" + x + "," + y + ") with " + color + " color"); }
}
