import java.util.Objects;

public class Rectangle {
    private Point pointA;
    private Point pointB;

    Rectangle(Point pointA, Point pointB){
        this.pointA = Objects.requireNonNull(pointA);
        this.pointB = Objects.requireNonNull(pointB);

        if(Objects.equals(pointA.getX(), pointB.getX()) || Objects.equals(pointA.getY(), pointB.getY())){
            throw new RuntimeException("A rectangle cannot have 0 area");
        }
    }

    public Point getPointA(){
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Double getArea(){
        Double length = Math.abs(pointB.getX() - pointA.getX());
        Double width = Math.abs(pointB.getY() - pointA.getY());
        return length * width;
    }

    public void move(Double deltaX, Double deltaY) {
        pointA.move(deltaX, deltaY);
        pointB.move(deltaX, deltaY);
    }
}
