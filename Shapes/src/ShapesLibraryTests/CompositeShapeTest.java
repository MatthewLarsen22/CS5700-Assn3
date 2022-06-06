package ShapesLibraryTests;

import ShapesLibrary.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeShapeTest {
    @Test
    void testCompositeShapeCreation(){
        CompositeShape compositeShape = new CompositeShape();
        // Setup
        Point center = new Point(-4.0, 5.0);
        Double innerRadius = 4.2;
        Double outerRadius = 6.325;

        // Stimulate
        NPointStar nPointStar = new NPointStar(center, 4, innerRadius, outerRadius);
        compositeShape.add(nPointStar);

        // Setup
        Point pointA = new Point(-5.0, -5.0);
        Point pointB = new Point(5.0, 5.0);

        // Stimulate
        Square square = new Square(pointA, pointB);
        compositeShape.add(square);



        CompositeShape compositeShape2 = new CompositeShape();

        // Setup
        Point pointC = new Point(0.0, 0.0);
        Point pointD = new Point(4.0, 5.0);
        Point pointE = new Point(4.0, -5.0);

        // Stimulate
        Triangle triangle = new Triangle(pointC, pointD, pointE);
        compositeShape2.add(triangle);
        compositeShape2.add(compositeShape);



        assertEquals(nPointStar, compositeShape.getShape(0));
        assertEquals(square, compositeShape.getShape(1));
        assertEquals(triangle, compositeShape2.getShape(0));
        assertEquals(compositeShape, compositeShape2.getShape(1));
    }

    @Test
    void testArea(){
        CompositeShape compositeShape = new CompositeShape();
        //Setup
        Point center = new Point(-4.0, 5.0);
        Double innerRadius = 3 * Math.sqrt(2);
        Double outerRadius = 7.0;

        // Stimulate
        NPointStar nPointStar = new NPointStar(center, 4, innerRadius, outerRadius);
        compositeShape.add(nPointStar);

        // Setup
        Point pointA = new Point(-5.0, -5.0);
        Point pointB = new Point(5.0, 5.0);

        // Stimulate
        Square square = new Square(pointA, pointB);
        compositeShape.add(square);



        CompositeShape compositeShape2 = new CompositeShape();

        // Setup
        Point pointC = new Point(0.0, 0.0);
        Point pointD = new Point(4.0, 5.0);
        Point pointE = new Point(4.0, -5.0);

        // Stimulate
        Triangle triangle = new Triangle(pointC, pointD, pointE);
        compositeShape2.add(triangle);
        compositeShape2.add(compositeShape);



        assertEquals(184.0, compositeShape.getArea(), .005);
        assertEquals(204.0, compositeShape2.getArea(), .005);
    }
}
