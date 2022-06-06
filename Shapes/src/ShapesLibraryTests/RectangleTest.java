package ShapesLibraryTests;

import ShapesLibrary.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testRectangleCreation(){
        // Setup
        Point pointA = new Point(-4.0, -5.0);
        Point pointB = new Point(4.0, 5.0);

        // Stimulate
        Rectangle rectangle = new Rectangle(pointA, pointB);

        // Compare
        assertEquals(-4.0, rectangle.getPointA().getX());
        assertEquals(-5.0, rectangle.getPointA().getY());

        assertEquals(4.0, rectangle.getPointB().getX());
        assertEquals(5.0, rectangle.getPointB().getY());
    }

    @Test
    void testArea(){
        // Setup
        Point pointA = new Point(-4.0, -5.0);
        Point pointB = new Point(4.0, 5.0);

        // Stimulate
        Rectangle rectangle = new Rectangle(pointA, pointB);
        Double area = rectangle.getArea();

        // Compare
        assertEquals(80.0, area);
    }

    @Test
    void testMoving(){
// Setup
        Point pointA = new Point(-4.0, -5.0);
        Point pointB = new Point(4.0, 5.0);

        Rectangle rectangle = new Rectangle(pointA, pointB);

        // Stimulate
        rectangle.move(1.5, -2.5);

        // Compare
        assertEquals(-2.5, rectangle.getPointA().getX());
        assertEquals(-7.5, rectangle.getPointA().getY());

        assertEquals(5.5, rectangle.getPointB().getX());
        assertEquals(2.5, rectangle.getPointB().getY());
    }
}