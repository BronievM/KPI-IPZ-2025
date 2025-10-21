package Flyweight;

/**
 * Клас для збереження координат пікселя
 * Використовується для відображення пікселів у сцені
 */
public class Coords {
    /** Координата x */
    int x;
    /** Коодината y */
    int y;

    /**
     * Конструктор.
     * @param x координата по горизонталі
     * @param y координата по вертикалі
     */
    public Coords(int x, int y) {
        this.x = x;
        this.y = y;
    }
}