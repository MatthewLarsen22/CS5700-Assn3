import java.util.Objects;

public class Square extends Rectangle{
    private Point pointA;
    private Point pointB;

    Square(Point pointA, Point pointB) {
        super(pointA, pointB);

        this.pointA = Objects.requireNonNull(pointA);
        this.pointB = Objects.requireNonNull(pointB);

        Double length = Math.abs(pointB.getX() - pointA.getX());
        Double width = Math.abs(pointB.getY() - pointA.getY());

        if(Objects.equals(pointA.getX(), pointB.getX()) || Objects.equals(pointA.getY(), pointB.getY())){
            throw new RuntimeException("A square cannot have 0 area");
        }
        else if (! length.equals(width)) {
            throw new RuntimeException("A square must have the same length and width.");
        }
    }
}
