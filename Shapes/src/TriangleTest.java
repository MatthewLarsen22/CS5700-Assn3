import org.junit.jupiter.api.Test;

import java.util.function.DoublePredicate;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testTriangleCreation(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(4.0, -5.0);

        // Stimulate
        Triangle triangle = new Triangle(pointA, pointB, pointC);

        // Compare
        assertEquals(0.0, triangle.getPointA().getX());
        assertEquals(0.0, triangle.getPointA().getY());

        assertEquals(4.0, triangle.getPointB().getX());
        assertEquals(5.0, triangle.getPointB().getY());

        assertEquals(4.0, triangle.getPointC().getX());
        assertEquals(-5.0, triangle.getPointC().getY());
    }

    @Test
    void testArea(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(4.0, -5.0);

        // Stimulate
        Triangle triangle = new Triangle(pointA, pointB, pointC);
        Double area = triangle.getArea();

        // Compare
        assertEquals(20.0, area);
    }

    @Test
    void testMoving(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(4.0, -5.0);

        Triangle triangle = new Triangle(pointA, pointB, pointC);

        // Stimulate
        triangle.move(1.5, -2.5);

        // Compare
        assertEquals(1.5, triangle.getPointA().getX());
        assertEquals(-2.5, triangle.getPointA().getY());

        assertEquals(5.5, triangle.getPointB().getX());
        assertEquals(2.5, triangle.getPointB().getY());

        assertEquals(5.5, triangle.getPointC().getX());
        assertEquals(-7.5, triangle.getPointC().getY());

    }
}