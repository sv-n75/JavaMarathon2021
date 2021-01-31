package Tests.day9.Task1;

import Tests.AbstractTest;
import day9.Task1.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9StudentTest extends AbstractTest {

    Student student = new Student("george", "A");

    @Test
    void printInfo() {
        Student student = new Student("george", "A");
        student.printInfo();
        assertEquals("Этот человек с именем george" + System.lineSeparator() + "Этот студент с именем george" + System.lineSeparator(), getOutput(),
                "Метод printInfo() вызван у обекта класса Student, с полем name = george");
    }

    @Test
    public void getGroup() {
        String group = student.getGroupName();
        assertEquals("A", group, "Метод getGroup() вызван у обекта класса Student, с полем groupName = A");
    }
}