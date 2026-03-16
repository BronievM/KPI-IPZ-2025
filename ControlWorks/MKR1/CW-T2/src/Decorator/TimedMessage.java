package Decorator;

public class TimedMessage extends MessageDecorator {
    public TimedMessage(IMessage message) { super(message); }
    public String getContent() {
        return java.time.LocalDateTime.now() + " | " + message.getContent();
    }
}
