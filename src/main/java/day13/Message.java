package day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    User sender;
    User receiver;
    private String text;
    Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();

    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat formater = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        return "FROM: " + sender.getName() + "\n" +
                "TO: " + receiver.getName() + "\n" +
                "ON: " + formater.format(date) + "\n" +
                text + "\n";
        //   E MMM dd HH:mm:ss z yyyy.

    }
}

