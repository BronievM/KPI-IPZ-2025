package main.java.com.lab111;

/**
 * Клас {@code Class1} демонструє приклад агрегації та реалізації інтерфейсу.
 * Клас реалізує інтерфейс {@link Interface1} та містить атрибут
 * типу {@link Class3}, що демонструє агрегаційний зв’язок.
 * Методи {@code meth2()} делегуються об’єкту {@code class3}.
 */
public class Class1 implements Interface1 {

    /**
     * Атрибут типу {@link Class3}.
     * Реалізує агрегаційний зв’язок: об’єкт {@code Class1}
     * містить посилання на об’єкт {@code Class3}, але не керує його життєвим циклом.
     */
    private Class3 class3;

    /**
     * Конструктор класу {@code Class1}.
     *
     * @param class3 об’єкт типу {@link Class3}, який буде агреговано
     */
    public Class1(Class3 class3) {
        this.class3 = class3;
    }

    /**
     * Реалізація методу {@code meth1()} з інтерфейсу {@link Interface1}.
     * Виводить у консоль повідомлення про виклик методу.
     */
    @Override
    public void meth1() {
        System.out.println("Class1.meth1()");
    }

    /**
     * Делегує виклик методу {@code meth2()} агрегованому об’єкту {@link Class3}.
     * Якщо об’єкт не ініціалізовано, виводить повідомлення про відсутність,
     * інакше виводить у консоль повідомлення про виклик методу.
     */
    public void meth2() {
        if (class3 != null) {
            class3.meth2();
        } else {
            System.out.println("Class3 is'nt initialized");
        }
    }

    /**
     * Делегує виклик методу {@code meth3()} агрегованому об’єкту {@link Class3}.
     * Якщо об’єкт не ініціалізовано, виводить повідомлення про відсутність,
     * інакше виводить у консоль повідомлення про виклик методу.
     */
    public void meth3() {
        if (class3 != null) {
            class3.meth3();
        } else {
            System.out.println("Class3 is'nt initialized");
        }
    }
}