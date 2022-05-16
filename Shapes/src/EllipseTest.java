import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {
    @Test
    void testEllipseCreation(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 10.0;

        // Stimulate
        Ellipse ellipse = new Ellipse(center, horizontalRadius, verticalRadius);

        // Compare
        assertEquals(4.0, ellipse.getCenter().getX());
        assertEquals(-5.0, ellipse.getCenter().getY());

        assertEquals(horizontalRadius, ellipse.getHorizontalRadius());
        assertEquals(verticalRadius, ellipse.getVerticalRadius());
    }

    @Test
    void testArea(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 10.0;

        Ellipse ellipse = new Ellipse(center, horizontalRadius, verticalRadius);

        // Stimulate
        Double area = ellipse.getArea();

        // Compare
        assertEquals(Math.PI * horizontalRadius * verticalRadius, area);
    }

    @Test
    void testMoving(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 10.0;

        Ellipse ellipse = new Ellipse(center, horizontalRadius, verticalRadius);

        // Stimulate
        ellipse.move(-1.5, 2.5);

        // Compare
        assertEquals(2.5, ellipse.getCenter().getX());
        assertEquals(-2.5, ellipse.getCenter().getY());

        assertEquals(horizontalRadius, ellipse.getHorizontalRadius());
        assertEquals(verticalRadius, ellipse.getVerticalRadius());
    }
}