package Tests.day3;

import Tests.AbstractTest;
import day3.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day3Task1Test extends AbstractTest {

    @Test
    public void Moscow() {
        setInput("Москва\nStop\n");
        Task1.main(new String[0]);
        assertEquals("Россия" + System.lineSeparator(), getOutput(), "Москва");
    }

    @Test
    public void Milan() {
        setInput("Милан\nStop\n");
        Task1.main(new String[0]);
        assertEquals("Италия" + System.lineSeparator(), getOutput(), "Милан");
    }

    @Test
    public void London() {
        setInput("Лондон\nStop\n");
        Task1.main(new String[0]);
        assertEquals("Англия" + System.lineSeparator(), getOutput(), "Лондон");
    }

    @Test
    public void Munich() {
        setInput("Мюнхен\nStop\n");
        Task1.main(new String[0]);
        assertEquals("Германия" + System.lineSeparator(), getOutput(), "Мюнхен");
    }

    @Test
    public void Other() {
        setInput("Лиссабон\nStop\n");
        Task1.main(new String[0]);
        assertEquals("Неизвестная страна" + System.lineSeparator(), getOutput(), "Лиссабон");
    }

}
