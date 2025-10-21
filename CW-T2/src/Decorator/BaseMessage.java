package Decorator;

public class BaseMessage implements IMessage {
    private String message;
    public BaseMessage(String content) {
        this.message = content;
    }
    public String getContent() {
        return this.message;
    }
}
