package Tests.day8;

import Tests.AbstractTest;
import day8.Airplane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day8AirplaneTest extends AbstractTest {

    @Test
    void testToString() {
        Airplane a1 = new Airplane("boeing", 1990, 20000, 60000);
        System.out.println(a1);
        assertEquals("Изготовитель: boeing, год выпуска: 1990, длина: 20000, вес: 60000, "
                + "количество топлива в баке: 0" + System.lineSeparator(), getOutput(), "Для самолета: producer \"boeing\", "
                + "year 1990, length 20000, weight 60000");
    }

}