package Decorator;

public class SignedMessage extends MessageDecorator {
    public SignedMessage(IMessage message) { super(message); }
    public String getContent() {
        return "Maksym Kulikov (@Broniev) | " +  message.getContent();
    }
}
