import Decorator.*;

public class Main {
    public static void main(String[] args) {
        IMessage msg = new BaseMessage("Hi!! I'm Maksym   and i wrote that program!    how are you?");
        System.out.println(msg.getContent());

        msg = new CompressedMessage(msg);
        System.out.println(msg.getContent());
        msg = new TimedMessage(msg);
        System.out.println(msg.getContent());
        msg = new SignedMessage(msg);
        System.out.println(msg.getContent());
        msg = new EncryptedMessage(msg);
        System.out.println(msg.getContent());

    }
}