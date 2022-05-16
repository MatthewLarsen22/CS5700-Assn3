import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testEllipseCreation(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 5.0;

        // Stimulate
        Circle circle = new Circle(center, horizontalRadius, verticalRadius);

        // Compare
        assertEquals(4.0, circle.getCenter().getX());
        assertEquals(-5.0, circle.getCenter().getY());

        assertEquals(horizontalRadius, circle.getHorizontalRadius());
        assertEquals(verticalRadius, circle.getVerticalRadius());
    }

    @Test
    void testArea(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 5.0;

        Circle circle = new Circle(center, horizontalRadius, verticalRadius);

        // Stimulate
        Double area = circle.getArea();

        // Compare
        assertEquals(Math.PI * horizontalRadius * verticalRadius, area);
    }

    @Test
    void testMoving(){
        // Setup
        Point center = new Point(4.0, -5.0);
        Double horizontalRadius = 5.0;
        Double verticalRadius = 5.0;

        Circle circle = new Circle(center, horizontalRadius, verticalRadius);

        // Stimulate
        circle.move(-1.5, 2.5);

        // Compare
        assertEquals(2.5, circle.getCenter().getX());
        assertEquals(-2.5, circle.getCenter().getY());

        assertEquals(horizontalRadius, circle.getHorizontalRadius());
        assertEquals(verticalRadius, circle.getVerticalRadius());
    }
}