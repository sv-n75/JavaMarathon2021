package Tests.day9.Task2;

import Tests.AbstractTest;
import day9.Task2.Circle;
import day9.Task2.Figure;
import day9.Task2.Rectangle;
import day9.Task2.TestFigures;
import day9.Task2.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day9TestFiguresTest extends AbstractTest {

    Figure[] f;

    @BeforeEach
    public void init() {
        f = new Figure[]{
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
    }

    @Test
    void calculateRedPerimeter() {
        assertEquals(192.9645943005142D, TestFigures.calculateRedPerimeter(f));
    }

    @Test
    void calculateRedArea() {
        assertEquals(530.344455747027D, TestFigures.calculateRedArea(f));
    }
}