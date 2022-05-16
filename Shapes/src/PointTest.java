import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testPointCreation(){
        // Setup
        Point a = new Point(1.5, 2.5);
        Point b = new Point(null, null);
        Point c = new Point(-12.0, -100.23);

        // Stimulate not needed

        // Compare
        assertEquals(1.5, a.getX());
        assertEquals(2.5, a.getY());

        assertEquals(0.0, b.getX());
        assertEquals(0.0, b.getY());

        assertEquals(-12.0, c.getX());
        assertEquals(-100.23, c.getY());
    }

    @Test
    void testPointCloning(){
        // Setup
        Point a = new Point(1.5, 2.5);
        Point b = new Point(-12.0, -100.23);

        // Stimulate
        Point c = a.clone();
        Point d = b.clone();

        // Compare
        assertEquals(1.5, c.getX());
        assertEquals(2.5, c.getY());

        assertEquals(-12.0, d.getX());
        assertEquals(-100.23, d.getY());
    }

    @Test
    void testPointMoving(){
        // Setup
        Point a = new Point(1.5, 2.5);
        Point b = new Point(-12.0, -100.23);

        // Stimulate
        a.move(0.25, -4.25);
        b.move(-2.5, 100.23);

        // Compare
        assertEquals(1.75, a.getX());
        assertEquals(-1.75, a.getY());

        assertEquals(-14.5, b.getX());
        assertEquals(0.0, b.getY());
    }
}