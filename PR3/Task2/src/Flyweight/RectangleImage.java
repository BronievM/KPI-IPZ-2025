package Flyweight;
import java.util.*;

/**
 * Клас для формування зображення з пікселів.
 * Зберігає координати та посилання на пікселі (Flyweight).
 */
public class RectangleImage {
    private List<Coords> coordsList = new ArrayList<>();
    private List<Pixel> pixels = new ArrayList<Pixel>();

    /**
     * Додає піксель із заданими координатами та кольором.
     * @param x координата по горизонталі
     * @param y координата по вертикалі
     * @param color колір пікселя
     */
    public void addPixel(int x, int y, String color) {
        Pixel NewPixel = PixelFactory.getPixel(color);
        pixels.add(NewPixel);
        coordsList.add(new Coords(x, y));
    }

    /**
     * Малює усі пікселі.
     * Викликає draw() для кожного Pixel із відповідними координатами.
     */
    public void draw() {
        for (int i = 0; i < pixels.size(); i++) {
            pixels.get(i).draw(coordsList.get(i).x, coordsList.get(i).y);
        }
    }
}
