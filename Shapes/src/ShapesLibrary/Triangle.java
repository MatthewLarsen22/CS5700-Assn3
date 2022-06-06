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
        Double area = (pointA.getX() - pointC.getX()) * (pointB.getY() - pointA.getY());
        area -= (pointA.getX() - pointB.getX()) * (pointC.getY() - pointA.getY());
        area = Math.abs(area)/2;
        return area;
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        pointA.move(deltaX, deltaY);
        pointB.move(deltaX, deltaY);
        pointC.move(deltaX, deltaY);
    }
}
