package ShapesLibrary;

public class Square extends Rectangle{
    public Square(Point pointA, Point pointB) {
        super(pointA, pointB);

        Double length = Math.abs(this.getPointB().getX() - this.getPointA().getX());
        Double width = Math.abs(this.getPointB().getY() - this.getPointA().getY());

        if (! length.equals(width)) {
            throw new RuntimeException("A square must have the same length and width.");
        }
    }
}
