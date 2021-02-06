package Tests.day14;

import Tests.AbstractTest;
import day14.NotTenException;
import day14.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

class Day14Task1Test extends AbstractTest {

    @Test
    void sumDigits1() throws FileNotFoundException, NotTenException {
        File file = new File("src/test/resources/D14T1_1.txt");
        Task1.printSumDigits(file);
        Assertions.assertEquals(10 + System.lineSeparator(), getOutput(), "Файл содержит: 1 1 1 1 1 1 1 1 1 1");
    }

    @Test
    void sumDigits2() throws FileNotFoundException, NotTenException {
        File file = new File("src/test/resources/D14T1_2.txt");
        Task1.printSumDigits(file);
        Assertions.assertEquals(-10 + System.lineSeparator(), getOutput(), "Файл содержит: -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
    }
}