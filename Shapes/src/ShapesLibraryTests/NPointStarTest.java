package ShapesLibraryTests;

import ShapesLibrary.NPointStar;
import ShapesLibrary.Pentagon;
import ShapesLibrary.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NPointStarTest {
    @Test
    void testPentagonCreation(){
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double innerRadius = 4.2;
        Double outerRadius = 6.325;

        // Stimulate
        NPointStar nPointStar = new NPointStar(center, 4, innerRadius, outerRadius);

        assertEquals(-4.0, nPointStar.getCenter().getX());
        assertEquals(5.0, nPointStar.getCenter().getY());
        assertEquals(4, nPointStar.getNumPoints());
        assertEquals(4.2, nPointStar.getInnerRadius());
        assertEquals(6.325, nPointStar.getOuterRadius());
    }

    @Test
    void testArea(){
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double innerRadius = 3 * Math.sqrt(2);
        Double outerRadius = 7.0;

        // Stimulate
        NPointStar nPointStar = new NPointStar(center, 4, innerRadius, outerRadius);

        assertEquals(84.0, nPointStar.getArea(), .005);
    }

    @Test
    void testMoving(){
// Setup
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double innerRadius = 4.2;
        Double outerRadius = 6.325;

        // Stimulate
        NPointStar nPointStar = new NPointStar(center, 4, innerRadius, outerRadius);
        nPointStar.move( 5.11, -4.09);

        assertEquals(1.11, nPointStar.getCenter().getX(), .0005);
        assertEquals(0.91, nPointStar.getCenter().getY(), .0005);
        assertEquals(4, nPointStar.getNumPoints());
        assertEquals(4.2, nPointStar.getInnerRadius());
        assertEquals(6.325, nPointStar.getOuterRadius());
    }
}
