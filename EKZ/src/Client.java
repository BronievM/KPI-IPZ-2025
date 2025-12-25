public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.println("[" + name + "] >> " + s);
    }
}
