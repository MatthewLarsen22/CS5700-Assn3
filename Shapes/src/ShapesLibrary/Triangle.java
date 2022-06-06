package ShapesLibrary;

import java.util.Objects;

public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC){
        this.pointA = Objects.requireNonNull(pointA);
        this.pointB = Objects.requireNonNull(pointB);
        this.pointC = Objects.requireNonNull(pointC);

        if (this.getArea() == 0){
            throw new RuntimeException("The total area of a triangle cannot be 0");
        }
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB(){
        return pointB;
    }

    public Point getPointC(){
        return pointC;
    }

    @Override
    public Double getArea() {
        // See the formula under Using coordinates at https://en.wikipedia.org/wiki/Triangle#Using_coordinates

        Double a = pointA.getX() - pointC.getX();
        Double b = pointB.getY() - pointA.getY();

        Double c = pointA.getX() - pointB.getX();
        Double d = pointC.getY() - pointA.getY();

        return Math.abs((a * b) - (c * d)) / 2;
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        pointA.move(deltaX, deltaY);
        pointB.move(deltaX, deltaY);
        pointC.move(deltaX, deltaY);
    }
}
