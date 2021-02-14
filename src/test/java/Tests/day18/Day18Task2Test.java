package Tests.day18;

import day18.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day18Task2Test {

    @Test
    void five() {
        Assertions.assertEquals(5, Task2.count7(717771237), "717771237");
    }

    @Test
    void two() {
        Assertions.assertEquals(2, Task2.count7(1712370), "1712370");
    }

    @Test
    void negative() {
        Assertions.assertEquals(0, Task2.count7(-1123780), "-1123780");
    }
}