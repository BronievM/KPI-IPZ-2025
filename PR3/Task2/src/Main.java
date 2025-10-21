import Flyweight.*;
/**
 * Демонстраційний клас для показу роботи Flyweight-патерну.
 * Створює RectangleImage і додає пікселі з різними кольорами.
 * Використовує PixelFactory для економії пам'яті.
 */
public class Main {
    public static void main(String[] args) {
        RectangleImage img =  new RectangleImage();
        img.addPixel(0, 0, "Black");
        img.addPixel(1, 0, "Yellow");
        img.addPixel(1, 0, "Black");
        img.addPixel(1, 1, "Yellow");
        img.draw();
    }
}