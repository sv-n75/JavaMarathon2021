package Tests.day7;

import Tests.AbstractTest;
import day7.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.laughingpanda.beaninject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day7PlayerTest extends AbstractTest {

    @BeforeEach
    public void clear(){
        Inject.field("countPlayers").of(new Player(50)).with(0);
    }

    @Test
    public void addPlayer() {
        Player p = new Player(90);
        assertEquals(1, Player.getCountPlayers(), "Количество игроков на поле после создания первого экземпляра " +
                "класса Player");
    }

    @Test
    public void runNormal() {
        Player p = new Player(90);
        p.run();
        assertEquals(p.getStamina(), 89, "Вызов метода run, 1 раз на объекте класса Player (stamina = 90). Значение stamina: ");
    }

    @Test
    public void run1() {
        Player p = new Player(1);
        p.run();
        assertEquals(0, p.getStamina(), "Вызов метода run, 1 раз на объекте класса Player (stamina = 1). Значение stamina: ");
        assertEquals(0, Player.getCountPlayers(), "Создан один экземпляр Player. Вызов метода run, 1 раз на объекте класса " +
                "Player (stamina = 1). Общее количество игроков");
    }

    @Test
    public void run0() {
        Player p = new Player(0);
        p.run();
        assertEquals(0, p.getStamina(), "Вызов метода run, 1 раз на объекте класса Player (stamina = 0). Выносливость: ");
    }

    @Test
    public void countWhenStamina0() {
        Player p = new Player(1);
        Player p2 = new Player(10);
        Player p3 = new Player(10);
        Player p4 = new Player(10);

        p.run();
        p.run();
        p.run();
        p.run();
        assertEquals(0, p.getStamina());
        assertEquals(3, Player.getCountPlayers(), "Вызов метода run, 4 раза " +
                "на объекте класса Player (stamina = 1), при общем кол-ве игроков 4. Общее количество игроков стало");
    }

    @Test
    public void addPlayer6() {
        Player p1 = new Player(90);
        Player p2 = new Player(90);
        Player p3 = new Player(90);
        Player p4 = new Player(90);
        Player p5 = new Player(90);
        Player p6 = new Player(90);
        assertEquals(6, Player.getCountPlayers(), "Количество игроков в командах "
                + "после создания шестого экземпляра класса Player");
        Player.info();
        assertEquals("На поле нет свободных мест" + System.lineSeparator(), getOutput(), "Вызов метода printInfo()" +
                " при шести созданных игроках");
    }

    @Test
    public void addPlayer7() {
        Player p1 = new Player(90);
        Player p2 = new Player(90);
        Player p3 = new Player(90);
        Player p4 = new Player(90);
        Player p5 = new Player(90);
        Player p6 = new Player(90);
        Player p7 = new Player(90);
        assertEquals(6, Player.getCountPlayers(), "Количество игроков в команде "
                + "после создания седьмого экземпляра класса Player");
        Player.info();
        assertEquals("На поле нет свободных мест" + System.lineSeparator(), getOutput(), "Вызов метода printInfo()" +
                " при шести созданных игроках");
    }

}
