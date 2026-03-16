package Decorator;

public class EncryptedMessage extends MessageDecorator {
    public EncryptedMessage(IMessage message) { super(message);}
    public String getContent() { return message.getContent().replaceAll("\\S", "*");}
}
