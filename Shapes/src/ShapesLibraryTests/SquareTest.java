package ShapesLibraryTests;

import ShapesLibrary.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testSquareCreation(){
        // Setup
        Point pointA = new Point(-5.0, -5.0);
        Point pointB = new Point(5.0, 5.0);

        // Stimulate
        Square square = new Square(pointA, pointB);

        // Compare
        assertEquals(-5.0, square.getPointA().getX());
        assertEquals(-5.0, square.getPointA().getY());

        assertEquals(5.0, square.getPointB().getX());
        assertEquals(5.0, square.getPointB().getY());
    }

    @Test
    void testArea(){
        // Setup
        Point pointA = new Point(-5.0, -5.0);
        Point pointB = new Point(5.0, 5.0);

        // Stimulate
        Square square = new Square(pointA, pointB);
        Double area = square.getArea();

        // Compare
        assertEquals(100.0, area);
    }

    @Test
    void testMoving(){
        // Setup
        Point pointA = new Point(-5.0, -5.0);
        Point pointB = new Point(5.0, 5.0);

        Square square = new Square(pointA, pointB);

        // Stimulate
        square.move(1.5, -2.5);

        // Compare
        assertEquals(-3.5, square.getPointA().getX());
        assertEquals(-7.5, square.getPointA().getY());

        assertEquals(6.5, square.getPointB().getX());
        assertEquals(2.5, square.getPointB().getY());
    }
}