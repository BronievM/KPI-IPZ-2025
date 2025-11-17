package work5;

/**
 * Клас для зберігання координат (x, y)
 */
public class Position {
    private int x;
    private int y;

    /**
     * Конструктор для початкової позиції.
     * @param x Координата X
     * @param y Координата Y
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Додатковий конструктор для копіювання.
     * @param other Об'єкт Position для копіювання.
     */
    public Position(Position other) {
        this.x = other.x;
        this.y = other.y;
    }

    /**
     * Метод, який встановлює позицію x
     * @param x Розміщення по x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Метод, який встановлює позицію y
     * @param y Розміщення по y
     */
    public void setY(int y) {
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    /**
     * Метод-заглушка, який виводить позицію у string форматі
     */
    @Override
    public String toString() {
        return "Position: (x=" + x + ", y=" + y + ")";
    }
}