import work4.Iterator.*;
/**
 * Головний клас для демонстрації роботи власної реалізації патерну Ітератор.
 * Цей клас показує, як створити список рядків (`StringList`), обійти його
 * за допомогою стандартного ітератора, а також як використовувати відфільтровані
 * ітератори з різними умовами, що задаються за допомогою лямбда-виразів.
 *
 * @author Broniev
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String divider = ">----------------------------------------";

        StringList list = new StringList();
        list.add("Hello");
        list.add("I");
        list.add("added some text");
        list.add("right here");
        list.add("$1");
        list.add("$A");

        System.out.println("Standart iterated list: ");
        Iterator it = list.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(divider);

        System.out.println("Filtered iterated list (elements with more then 3 characters): ");
        Iterator filtered1 = list.createFilteredIterator(s -> s.length() > 3);
        while (filtered1.hasNext()) {
            System.out.println(filtered1.next());
        }
        System.out.println(divider);

        System.out.println("Filtered iterated list (elements with letter a inside (include uppercase)): ");
        Iterator filtered2 = list.createFilteredIterator(s -> s.toLowerCase().contains("a"));
        while (filtered2.hasNext()) {
            System.out.println(filtered2.next());
        }
    }
}