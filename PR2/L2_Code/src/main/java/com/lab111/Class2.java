package main.java.com.lab111;
/**
 * Клас {@code Class2} демонструє приклад агрегації та реалізації інтерфейсу.
 * Клас реалізує інтерфейс {@link Interface2} та містить атрибут
 * типу {@link Interface3}, що демонструє агрегаційний зв’язок.
 */
public class Class2 implements Interface2 {

    /**
     * Атрибут типу {@link Interface3}.
     * Реалізує агрегаційний зв’язок: об’єкт {@code Class2}
     * містить посилання на об’єкт, що реалізує {@code Interface3},
     * але не керує його життєвим циклом.
     */
    private Interface3 if3;

    /**
     * Реалізація методу {@code meth1()} з інтерфейсу {@link Interface2}.
     * Виводить у консоль повідомлення про виклик методу.
     */
    @Override
    public void meth1() {
        System.out.println("Class2.meth1()");
    }

    /**
     * Реалізація методу {@code meth2()} з інтерфейсу {@link Interface2}.
     * Виводить у консоль повідомлення про виклик методу.
     */
    @Override
    public void meth2() {
        System.out.println("Class2.meth2()");
    }

    /**
     * Метод класу {@code Class2}.
     * Виводить у консоль повідомлення про виклик методу.
     */
    public void meth3() {
        System.out.println("Class2.meth3()");
    }
}