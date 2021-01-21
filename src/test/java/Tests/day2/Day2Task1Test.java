package Tests.day2;

import Tests.AbstractTest;
import day2.Task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day2Task1Test extends AbstractTest {

    @Test
    public void lowFloor() {
        setInput("4");
        Task1.main(new String[0]);
        assertEquals("Малоэтажный дом" + System.lineSeparator(), getOutput(), "Введено 4");
    }

    @Test
    public void MiddleFloor() {
        setInput("5");
        Task1.main(new String[0]);
        assertEquals("Среднеэтажный дом" + System.lineSeparator(), getOutput(), "Введено 5");
    }

    @Test
    public void HighFloor() {
        setInput("9");
        Task1.main(new String[0]);
        assertEquals("Многоэтажный дом" + System.lineSeparator(), getOutput(), "Введено 9");
    }

    @Test
    public void Error0() {
        setInput("0");
        Task1.main(new String[0]);
        assertEquals("Ошибка ввода" + System.lineSeparator(), getOutput(), "Введено 0");
    }

    @Test
    public void ErrorMinus1() {
        setInput("-1");Task1.main(new String[0]);
        assertEquals("Ошибка ввода" + System.lineSeparator(), getOutput(), "Введено -1");
    }

}