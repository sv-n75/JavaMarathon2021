package Tests.day13;

import day13.MessageDatabase;
import day13.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day13UserTest {

    @Test
    void subscribe() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertEquals(1, a.getSubscriptions().size(), "У пользователя 1 в "
                + "списке подписок 1 подписка");
    }

    @Test
    void isSubscribedTrue() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertTrue(a.isSubscribed(b), "Пользователь 1 подписан на пользователя 2?");
    }

    @Test
    void isSubscribedFalse() {
        User a = new User("a");
        User b = new User("b");
        Assertions.assertFalse(a.isSubscribed(b), "Пользователь 1 не подписан на пользователя 2?");
    }

    @Test
    void isFriendTrue() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        b.subscribe(a);
        Assertions.assertTrue(a.isFriend(b), "Пользователи 1 и 2 друзья");
    }

    @Test
    void isFriendFalse() {
        User a = new User("a");
        User b = new User("b");
        a.subscribe(b);
        Assertions.assertFalse(a.isFriend(b), "Пользователи 1 и 2 не друзья");
    }

    @Test
    void sendMessage() {
        User a = new User("a");
        User b = new User("b");
        a.sendMessage(b, "hi");
        Assertions.assertEquals(1, MessageDatabase.getMessages().size(),
                "Пользователь 1 отправляет сообщение пользователю 2. Количество сообщений в базе данных");
    }
}