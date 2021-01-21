package Tests.day2;

import Tests.AbstractTest;
import day2.Task3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day2Task3Test extends AbstractTest {

    @Test
    public void One_ninetyEight() {
        setInput("1 98");
        Task3.main(new String[0]);
        assertEquals("5 15 25 35 45 55 65 75 85 95 ", getOutput(), "a = 1, b = 98");
    }

    @Test
    public void MinusTen_fifty() {
        setInput("-10 50");
        Task3.main(new String[0]);
        assertEquals("-5 5 15 25 35 45 ", getOutput(), "a = -10, b = 50");
    }

    @Test
    public void five_fifty() {
        setInput("5 50");
        Task3.main(new String[0]);
        assertEquals("15 25 35 45 ", getOutput(), "a = 5, b = 50");
    }

    @Test
    public void incorrectInput() {
        setInput("50 5");
        Task3.main(new String[0]);
        assertEquals("Некорректный ввод" + System.lineSeparator(), getOutput(), "a = 50, b = 5");
    }
}