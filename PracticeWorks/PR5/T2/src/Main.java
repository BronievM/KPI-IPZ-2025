package work5;
/**
 * Демонстраційний клас для шаблону State
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(">>>- Creating TCP-Connection (Start state: LISTENING)");
        TCPConnection connection = new TCPConnection();
        System.out.println("\n>>-- Tasks in state LISTENING");
        connection.send("Hello??");
        connection.receive();
        connection.open();
        System.out.println(">- task in state ESTABLISHED");
        connection.open();
        connection.send("Are there anyone alive..?");
        connection.receive();
        connection.close();
        System.out.println(">- Tasks in state CLOSED");
        connection.send("Please.. HELP ME!!");
        connection.receive();
        connection.close();
        System.out.println("\n>>-- Changing state to LISTENING");
        connection.open();
        System.out.println(">- Tasks in LISTENING");
        connection.send("I'm still waiting..");
    }
}