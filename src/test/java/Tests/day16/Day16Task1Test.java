package Tests.day16;

import Tests.AbstractTest;
import day16.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

class Day16Task1Test extends AbstractTest {

    @Test
    void test1() throws FileNotFoundException {
        File file = new File("src/test/resources/D16T1_1.txt");
        Task1.printResult(file);
        Assertions.assertEquals("23.285714285714285 --> 23.286", getOutput(),
                "Файл содержит: 5 2 8 34 1 36 77 0 43 98");
    }
}