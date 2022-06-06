package ShapesLibrary;

import java.util.Objects;

public class Rectangle extends Shape{
    private Point pointA;
    private Point pointB;

    public Rectangle(Point pointA, Point pointB){
        this.pointA = Objects.requireNonNull(pointA);
        this.pointB = Objects.requireNonNull(pointB);

        if(Objects.equals(pointA.getX(), pointB.getX()) || Objects.equals(pointA.getY(), pointB.getY())){
            throw new RuntimeException("A rectangle cannot have 0 width or height.");
        }
    }

    public Point getPointA(){
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Override
    public Double getArea(){
        Double length = Math.abs(pointB.getX() - pointA.getX());
        Double width = Math.abs(pointB.getY() - pointA.getY());
        return length * width;
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        pointA.move(deltaX, deltaY);
        pointB.move(deltaX, deltaY);
    }
}
