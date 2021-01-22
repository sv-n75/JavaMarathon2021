package Tests.day3;

import Tests.AbstractTest;
import day3.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Task2Test extends AbstractTest {
    @Test
    public void ShouldWorkProperly() {
        setInput("1 2\n15 3\n3 0\n");
        Task2.main(new String[0]);
        assertEquals("0.5" + System.lineSeparator() + "5.0" + System.lineSeparator(),
                getOutput(), "1 2     15 3     3 0");
    }

}
