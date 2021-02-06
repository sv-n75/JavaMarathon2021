package Tests.day14;

import Tests.AbstractTest;
import day14.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

class Day14Task3Test extends AbstractTest {

    @Test
    void normal() {
        File file = new File("src/test/resources/D14T2_1.txt");
        Assertions.assertEquals("[{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]",
                Task3.parseFileToObjList(file).toString(),
                "Файл содержит строки: \nMike 24\nJohn 19\nAnna 20\nMiguel 5");
    }

    @Test
    void negativeAge() {
        File file = new File("src/test/resources/D14T2_2.txt");
        Task3.parseFileToObjList(file);
        Assertions.assertEquals("Некорректный входной файл" + System.lineSeparator(), getOutput(),
                "В файле содержится отрицательный возраст");
    }

    @Test
    void fileNotFound() {
        File file = new File("src/test/resources/D14T2_miss.txt");
        Task3.parseFileToObjList(file);
        Assertions.assertEquals("Файл не найден" + System.lineSeparator(), getOutput(),
                "Попытка обратиться к файлу, которого нет");
    }

}