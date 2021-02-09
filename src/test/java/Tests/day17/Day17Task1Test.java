package Tests.day17;

import Tests.AbstractTest;
import day17.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day17Task1Test extends AbstractTest {

    @Test
    void chess() {
        Task1.main(new String[0]);
        Assertions.assertEquals("♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜ ", getOutput());
    }

}
