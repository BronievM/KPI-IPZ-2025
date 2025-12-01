import work6.*;

public class Main {
    public static void main(String[] args) {
        IntegerList list = new OrderedIntegerList();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(35);
        list.add(2);
        Iterator it = list.createIterator();
        System.out.println("[!] List created!");
        System.out.println("[!] Iterration cycle:");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}