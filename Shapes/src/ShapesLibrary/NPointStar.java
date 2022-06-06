package ShapesLibrary;

public class NPointStar extends Shape{
    private int numPoints;
    private Point center;
    private Double radius;

    public NPointStar(int numPoints, Point center, Double radius){
        this.numPoints = numPoints;
        this.center = center;
        this.radius = radius;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public Point getCenter() {
        return center;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return null;
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        center.move(deltaX, deltaY);
    }
}
