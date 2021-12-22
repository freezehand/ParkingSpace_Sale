package Pojo;

import org.apache.ibatis.type.Alias;

@Alias("Message")
public class Message {
    String id;
    String sender;
    String receiver;
    String content;
    String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Message() {
    }

    public Message(String id, String sender, String receiver, String content, String state) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.state = state;
    }
}
