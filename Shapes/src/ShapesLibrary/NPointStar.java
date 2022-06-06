package ShapesLibrary;

public class NPointStar extends Shape{
    private int numPoints;
    private Point center;
    private Double innerRadius;
    private Double outerRadius;

    public NPointStar(int numPoints, Point center, Double innerRadius, Double outerRadius){
        if (numPoints < 3){
            throw new RuntimeException("An N-point star must have at least 3 points");
        }
        this.numPoints = numPoints;
        this.center = center;
        if(innerRadius <= 0 || outerRadius <= 0){
            throw new RuntimeException("An N-point star cannot have a radius of 0 or less");
        }
        if(innerRadius > outerRadius){
            throw new RuntimeException("An N-point star cannot have an inner radius which is greater than the outer radius");
        }
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public Point getCenter() {
        return center;
    }

    public Double getInnerRadius() {
        return innerRadius;
    }

    public Double getOuterRadius() {
        return outerRadius;
    }

    @Override
    public Double getArea() {
        Double theta = (360.0 / (2 * numPoints));

        Point pointA = this.center;

        Point pointB = this.center;
        pointB.move(0.0, outerRadius);

        Point pointC = this.center;
        pointC.move(innerRadius * Math.cos(90 - theta), innerRadius * Math.sin(90 - theta));

        Triangle triangle = new Triangle(pointA, pointB, pointC);

        return 2 * numPoints * triangle.getArea();
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        center.move(deltaX, deltaY);
    }
}
