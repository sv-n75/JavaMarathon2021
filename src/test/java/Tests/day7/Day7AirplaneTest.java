package Tests.day7;

import Tests.AbstractTest;
import day7.Airplane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day7AirplaneTest extends AbstractTest {
    Airplane a1 = new Airplane("boeing", 2000, 100, 2000);
    Airplane a2 = new Airplane("sukhoy", 2010, 200, 2000);

    @Test
    public void firstLongerSecond() {
        Airplane.compareAirplanes(a1, a2);
        assertEquals("Второй самолет длиннее" + System.lineSeparator(), getOutput(), "Самолет 1 длина 100, самолет 2 длина 200");
    }

    @Test
    public void secondLongerFirst() {
        Airplane.compareAirplanes(a2, a1);
        assertEquals("Первый самолет длиннее" + System.lineSeparator(), getOutput(), "Самолет 1 длина 200, самолет 2 длина 100");
    }

    @Test
    public void equals() {
        Airplane a1 = new Airplane("boeing", 2000, 100, 2000);
        Airplane a2 = new Airplane("sukhoy", 2010, 100, 2000);
        Airplane.compareAirplanes(a2, a1);
        assertEquals("Длины самолетов равны" + System.lineSeparator(), getOutput(), "Самолет 1 длина 100, самолет 2 длина 100");
    }
}