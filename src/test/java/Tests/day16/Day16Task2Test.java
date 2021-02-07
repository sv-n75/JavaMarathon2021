package Tests.day16;

import Tests.AbstractTest;
import day16.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

class Day16Task2Test extends AbstractTest {

    @Test
    void test1() throws FileNotFoundException {
        File file = new File("src/test/resources/D16T2_1.txt");
        Task2.printResult(file);
        Assertions.assertEquals("2563" + System.lineSeparator(), getOutput());
    }

    @Test
    void test2() throws FileNotFoundException {
        File file = new File("src/test/resources/D16T2_2.txt");
        Task2.printResult(file);
        Assertions.assertEquals("2510" + System.lineSeparator(), getOutput());
    }

}
