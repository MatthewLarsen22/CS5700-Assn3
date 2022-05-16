import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testLineCreation(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(-4.0, -5.0);

        // Stimulate
        Line lineA = new Line(pointA, pointB);
        Line lineB = new Line(pointB, pointC);

        // Compare
        assertEquals(0.0, lineA.getLeftPoint().getX());
        assertEquals(0.0, lineA.getLeftPoint().getY());
        assertEquals(4.0, lineA.getRightPoint().getX());
        assertEquals(5.0, lineA.getRightPoint().getY());

        assertEquals(-4.0, lineB.getLeftPoint().getX());
        assertEquals(-5.0, lineB.getLeftPoint().getY());
        assertEquals(4.0, lineB.getRightPoint().getX());
        assertEquals(5.0, lineB.getRightPoint().getY());
    }

    @Test
    void testSlope(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(4.0, -5.0);

        // Stimulate
        Line lineA = new Line(pointA, pointB);
        Line lineB = new Line(pointC, pointA);
        Line lineC = new Line(pointB, pointC);

        // Compare
        assertEquals(1.25, lineA.getSlope());
        assertEquals(-1.25, lineB.getSlope());
        assertEquals(Double.POSITIVE_INFINITY, lineC.getSlope());
    }

    @Test
    void testLength(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(3.0, 4.0);
        Point pointC = new Point(3.0, -4.0);

        // Stimulate
        Line lineA = new Line(pointA, pointB);
        Line lineB = new Line(pointC, pointA);
        Line lineC = new Line(pointB, pointC);

        // Compare
        assertEquals(5, lineA.getLength());
        assertEquals(5, lineB.getLength());
        assertEquals(8, lineC.getLength());
    }

    @Test
    void testMoving(){
        // Setup
        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(4.0, 5.0);
        Point pointC = new Point(-4.0, -5.0);

        Line lineA = new Line(pointA, pointB);
        Line lineB = new Line(pointB, pointC);

        // Stimulate
        lineA.move(1.5, 2.5);
        lineB.move(-1.5, -2.5);

        // Compare
        assertEquals(1.5, lineA.getLeftPoint().getX());
        assertEquals(2.5, lineA.getLeftPoint().getY());
        assertEquals(5.5, lineA.getRightPoint().getX());
        assertEquals(7.5, lineA.getRightPoint().getY());

        assertEquals(-5.5, lineB.getLeftPoint().getX());
        assertEquals(-7.5, lineB.getLeftPoint().getY());
        assertEquals(2.5, lineB.getRightPoint().getX());
        assertEquals(2.5, lineB.getRightPoint().getY());

    }
}