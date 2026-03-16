package main.java.com.lab111;

/**
 * Головний клас програми {@code Main}.
 *
 * Клас містить метод {@link #main(String[])}, який демонструє роботу
 * класів {@link Class1}, {@link Class2} та {@link Class3}.
 *
 * Виводить у консоль повідомлення про виклики методів і демонструє
 * агрегацію та реалізацію інтерфейсів у класах проекту.
 *
 * @author Maksym Kulikov (aka @broniev)
 */
public final class Main {
    /**
     * Приватний конструктор для запобігання створенню об’єктів класу.
     */
    private Main() {
        super();
    }

    /**
     * Точка входу в програму.
     * Демонструє виклики методів класів {@link Class1}, {@link Class2} та {@link Class3}.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(final String[] args) {
        System.out.println("This is MainClass running message!!");

        Class2 cl2 = new Class2();
        Class3 cl3 = new Class3();
        Class1 cl1 = new Class1(cl3);

        System.out.println("> Next messages is called from Class1");
        cl1.meth1();
        cl1.meth2();
        cl1.meth3();
        System.out.println("> Next messages is called from Class2");
        cl2.meth2();
        cl2.meth3();
        System.out.println("> Next message is called from Class3");
        cl3.meth2();
        cl3.meth3();
    }
}
