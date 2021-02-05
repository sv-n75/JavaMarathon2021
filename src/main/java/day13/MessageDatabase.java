package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        //   этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:

        //  user1: Привет!
        //         user2: Привет, user1!
        //           user1: Как у тебя дела?
        //  user2: Все ок, спасибо :)
        for (Message m : messages) {
            if (m.getSender().equals(u1) && m.getReceiver().equals(u2))
                System.out.println(m.sender.getName() + ": " + m.getText());
            if (m.getReceiver().equals(u1) && m.getSender().equals(u2))
                System.out.println(m.sender.getName() + ": " + m.getText());
        }
    }
}
