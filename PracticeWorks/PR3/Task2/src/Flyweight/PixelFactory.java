package Flyweight;
import java.util.*;

/**
 * Фабрика пікселів.
 * Реалізує керування об'єктами Pixel для Flyweight-патерну.
 * Створює новий піксель лише якщо ще не існує пікселя з таким кольором.
 */
public class PixelFactory {
    /** Збереження вже створених пікселів */
    private static Map<String, Pixel> pixels = new HashMap<>();

    /**
     * Повертає піксель з заданим кольором.
     * Створює новий, якщо такого ще не існує.
     * @param color колір пікселя
     * @return об'єкт Pixel
     */
    public static Pixel getPixel(String color) {
        Pixel pixel = pixels.get(color);
        if (pixel == null) {
            pixel = new Pixel(color);
            pixels.put(color, pixel);
            System.out.println("Created new pixel with " + color + " color");
        }
        return pixel;
    }
}
