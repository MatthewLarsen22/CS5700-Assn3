package ShapesLibrary;

public class NPointStar extends Shape{
    private int numPoints;
    private Point center;
    private Double innerRadius;
    private Double outerRadius;

    public NPointStar(Point center, int numPoints, Double innerRadius, Double outerRadius){
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
        Double theta = (2 * Math.PI / (2 * numPoints));

        Point pointA = this.center.clone();

        Point pointB = this.center.clone();
        pointB.move(0.0, outerRadius);

        Point pointC = this.center.clone();
        pointC.move(innerRadius * Math.cos((Math.PI / 2) - theta), innerRadius * Math.sin((Math.PI / 2) - theta));

        Triangle triangle = new Triangle(pointA, pointB, pointC);

        return 2 * numPoints * triangle.getArea();
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        center.move(deltaX, deltaY);
    }
}
