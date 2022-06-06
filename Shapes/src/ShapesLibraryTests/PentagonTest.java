package ShapesLibraryTests;

import ShapesLibrary.Point;
import ShapesLibrary.Pentagon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PentagonTest {
    @Test
    void testPentagonCreation(){
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double radius = 4.2;

        // Stimulate
        Pentagon pentagon = new Pentagon(center, radius);

        assertEquals(-4.0, pentagon.getCenter().getX());
        assertEquals(5.0, pentagon.getCenter().getY());
        assertEquals(4.2, pentagon.getRadius());
    }

    @Test
    void testArea(){
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double radius = 8.0;

        // Stimulate
        Pentagon pentagon = new Pentagon(center, radius);

        assertEquals(152.75, pentagon.getArea(), 1.0);
    }

    @Test
    void testMoving(){
// Setup
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double radius = 4.2;

        // Stimulate
        Pentagon pentagon = new Pentagon(center, radius);

        pentagon.move(5.2, -3.1);

        assertEquals(1.2, pentagon.getCenter().getX(), .0005);
        assertEquals(1.9, pentagon.getCenter().getY(), .0005);
        assertEquals(4.2, pentagon.getRadius());
    }
}
