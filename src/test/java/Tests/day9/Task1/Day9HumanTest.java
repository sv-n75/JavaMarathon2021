package Tests.day9.Task1;

import Tests.AbstractTest;
import day9.Task1.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9HumanTest extends AbstractTest {

    @Test
    void printInfo() {
        Human human = new Human("andrey");
        human.printInfo();
        assertEquals("Этот человек с именем andrey" + System.lineSeparator(), getOutput(), "Метод printInfo() вызван у "
                + "обекта класса Human, с полем name = andrey");
    }

}