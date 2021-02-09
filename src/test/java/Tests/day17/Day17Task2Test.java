package Tests.day17;

import Tests.AbstractTest;
import day17.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day17Task2Test extends AbstractTest {

    @Test
    void main() {
        Task2.main(new String[0]);
        String s = "♜____♜♚_" + System.lineSeparator()
                + "_♖__♟♟_♟" + System.lineSeparator()
                + "♟_♞___♟_" + System.lineSeparator()
                + "♛__♗____" + System.lineSeparator()
                + "___♝♙___" + System.lineSeparator()
                + "____♗♙__" + System.lineSeparator()
                + "♙__♕_♙_♙" + System.lineSeparator()
                + "_____♖♔_" + System.lineSeparator();
        Assertions.assertEquals(s, getOutput());
    }

}
