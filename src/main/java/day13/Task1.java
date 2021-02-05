package day13;

public class Task1 {
    public static void main(String[] args) {
        //Отправить 2 сообщения от пользователя 1 пользователю 2
        //Отправить 3 сообщения от пользователя 2 пользователю 1
        //Отправить 3 сообщения от пользователя 3 пользователю 1
        //Отправить 3 сообщения от пользователя 1 пользователю 3
        //Отправить 1 сообщение от пользователя 3 пользователю 1

        //Сообщения могут быть любыми.
        //После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
        User user1 = new User("AAA");
        User user2 = new User("BBB");
        User user3 = new User("CCC");
        MessageDatabase.messages.add(new Message(user1, user2, "ого"));
        MessageDatabase.messages.add(new Message(user1, user2, "угу"));

        MessageDatabase.messages.add(new Message(user2, user1, "ага"));
        MessageDatabase.messages.add(new Message(user2, user1, "ого"));
        MessageDatabase.messages.add(new Message(user2, user1, "аго"));

        MessageDatabase.messages.add(new Message(user3, user1, "ого"));
        MessageDatabase.messages.add(new Message(user3, user1, "ого"));
        MessageDatabase.messages.add(new Message(user3, user1, "ого"));

        MessageDatabase.messages.add(new Message(user1, user3, "опа"));
        MessageDatabase.messages.add(new Message(user1, user3, "попа"));
        MessageDatabase.messages.add(new Message(user1, user3, "жопа"));

        MessageDatabase.messages.add(new Message(user3, user1, "все"));

        MessageDatabase.showDialog(user1, user3);
        System.out.println(MessageDatabase.getMessages());
    }
}
