package Tests.day6;

import Tests.AbstractTest;
import day6.Airplane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day6AirplaneTest extends AbstractTest {
    Airplane a = new Airplane("boeing", 1990, 20000, 60000);

    @Test
    public void info() {
        a.info();
        assertEquals("Изготовитель: boeing, год выпуска: 1990, длина: 20000, вес: 60000, "
                + "количество топлива в баке: 0" + System.lineSeparator(), getOutput(), "Для самолета: producer \"boeing\", "
                + "year 1990, length 20000, weight 60000");
    }

    @Test
    public void fillUp() {
        a.fillUp(100);
        assertEquals(100, a.getFuel(), "Количество топлива 0, fillUp(100)");
        a.fillUp(400);
        assertEquals(500, a.getFuel(), "Количество топлива 0, два вызова метода fillUp(100), fillUp(400)");
    }

    @Test
    public void infoAfterFillUp() {
        a.fillUp(400);
        a.info();
        assertEquals("Изготовитель: boeing, год выпуска: 1990, длина: 20000, вес: 60000, "
                + "количество топлива в баке: 400" + System.lineSeparator(), getOutput(), "Для самолета: producer \"boeing\", "
                + "year 1990, length 20000, weight 60000, вызов метода fillUp(400)");
    }

}