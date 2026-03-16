package main.java.com.lab111;

/**
 * Клас {@code Class3} демонструє приклад генералізації та агрегації.
 * Генералізація реалізується через наслідування від класу {@link Class2},
 * а агрегація — через наявність атрибута типу {@link Interface2}.
 * Клас також реалізує інтерфейс {@link Interface2}.
 */
public class Class3 extends Class2 implements Interface3 {

    /**
     * Атрибут типу {@link Interface2}.
     * Реалізує агрегаційний зв’язок: об’єкт {@code Class3}
     * містить посилання на об’єкт, що реалізує {@code Interface2}, але не керує його життєвим циклом.
     */
    private Interface2 interface2;

    /**
     * Метод класу {@code Class3}.
     * Виводить у консоль повідомлення про виклик методу.
     */
    public void meth3() {
        System.out.println("Class3.meth3()");
    }

    /**
     * Реалізація методу {@code meth2()} з інтерфейсу {@link Interface2}
     * Перевизначає метод і виводить повідомлення у консоль.
     */
    @Override
    public void meth2() {
        System.out.println("Class3.meth2()");
    }
}