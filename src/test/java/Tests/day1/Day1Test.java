package Tests.day1;

import Tests.AbstractTest;
import day1.Task1;
import day1.Task2;
import day1.Task3;
import day1.Task4;
import day1.Task5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test extends AbstractTest {

    @Test
    public void Task1() {
        final String resultString = "JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA ";
        Task1.main(new String[0]);
        assertEquals(resultString, getOutput(), "Количество повторений слова \"JAVA\", в строке, не равно десяти");
    }

   @Test
    public void Task2() {
        final String resultString = "JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA ";
        Task2.main(new String[0]);
        assertEquals(resultString, getOutput(), "Количество повторений слова \"JAVA\", в строке, не равно десяти");
    }

    @Test
    public void Task3() {
        final String resultString = "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator() +
                "JAVA" + System.lineSeparator();
        Task3.main(new String[0]);
        assertEquals(resultString, getOutput(), "Количество повторений слова \"JAVA\", не равно десяти строкам");
    }

    @Test
    public void Task4() {
        final String resultString =
                "Олимпиада 1980 года" + System.lineSeparator() +
                        "Олимпиада 1984 года" + System.lineSeparator() +
                        "Олимпиада 1988 года" + System.lineSeparator() +
                        "Олимпиада 1992 года" + System.lineSeparator() +
                        "Олимпиада 1996 года" + System.lineSeparator() +
                        "Олимпиада 2000 года" + System.lineSeparator() +
                        "Олимпиада 2004 года" + System.lineSeparator() +
                        "Олимпиада 2008 года" + System.lineSeparator() +
                        "Олимпиада 2012 года" + System.lineSeparator() +
                        "Олимпиада 2016 года" + System.lineSeparator() +
                        "Олимпиада 2020 года" + System.lineSeparator();
        Task4.main(new String[0]);
        assertEquals(resultString, getOutput(), "Не верное количество строк или ошибка в тексте");
    }

    @Test
    public void Task5() {
        final String resultString =
                "Олимпиада 1980 года" + System.lineSeparator() +
                        "Олимпиада 1984 года" + System.lineSeparator() +
                        "Олимпиада 1988 года" + System.lineSeparator() +
                        "Олимпиада 1992 года" + System.lineSeparator() +
                        "Олимпиада 1996 года" + System.lineSeparator() +
                        "Олимпиада 2000 года" + System.lineSeparator() +
                        "Олимпиада 2004 года" + System.lineSeparator() +
                        "Олимпиада 2008 года" + System.lineSeparator() +
                        "Олимпиада 2012 года" + System.lineSeparator() +
                        "Олимпиада 2016 года" + System.lineSeparator() +
                        "Олимпиада 2020 года" + System.lineSeparator();
        Task5.main(new String[0]);
        assertEquals(resultString, getOutput(), "Не верное количество строк или ошибка в тексте");
    }

}
