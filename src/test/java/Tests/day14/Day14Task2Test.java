package Tests.day14;

import Tests.AbstractTest;
import day14.Task2;
import day14.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

class Day14Task2Test extends AbstractTest {

    @Test
    void normal() throws FileNotFoundException {
        File file = new File("src/test/resources/D14T2_1.txt");
        Assertions.assertEquals("[Mike 24, John 19, Anna 20, Miguel 5]",
                Task2.parseFileToStringList(file).toString(),
                "Файл содержит строки: \nMike 24\nJohn 19\nAnna 20\nMiguel 5");
    }

    @Test
    void negativeAge() throws FileNotFoundException {
        File file = new File("src/test/resources/D14T2_2.txt");
        Task2.parseFileToStringList(file);
        Assertions.assertEquals("Некорректный входной файл" + System.lineSeparator(), getOutput(),
                "В файле содержится отрицательный возраст");
    }

    @Test
    void fileNotFound() throws FileNotFoundException {
        File file = new File("src/test/resources/D14T2_miss.txt");
        Task2.parseFileToStringList(file);
        Assertions.assertEquals("Файл не найден" + System.lineSeparator(), getOutput(),
                "Попытка обратиться к файлу, которого нет");
    }


}