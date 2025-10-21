package Decorator;

public class CompressedMessage extends MessageDecorator {
    public CompressedMessage(IMessage message) { super(message); }
    public String getContent() {
        return message.getContent().replaceAll("\\s+", " ").trim();
    }
}
