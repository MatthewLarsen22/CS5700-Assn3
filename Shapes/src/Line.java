import java.util.Objects;

public class Line {
    private Point leftPoint;
    private Point rightPoint;

    public Line(Point pointA, Point pointB){
        if (Objects.equals(pointA.getX(), pointB.getX()) && Objects.equals(pointA.getY(), pointB.getY())){
            throw new RuntimeException("A line cannot have two points at the same location.");
        }
        else{
            this.leftPoint = Objects.requireNonNull(pointA);
            this.rightPoint = Objects.requireNonNull(pointB);

            // Make sure that the left point truly is to the left of the right point
            if(leftPoint.getX() > rightPoint.getX()){
                Point temp = leftPoint.clone();
                leftPoint = rightPoint.clone();
                rightPoint = temp.clone();
            }
        }
    }

    public Point getLeftPoint() {
        return leftPoint;
    }

    public Point getRightPoint() {
        return rightPoint;
    }

    public Double getSlope(){
        Double rise = rightPoint.getY() - leftPoint.getY();
        Double run = rightPoint.getX() - leftPoint.getX();
        if(run == 0.0){
            return Double.POSITIVE_INFINITY;
        }
        else {
            return rise / run;
        }
    }

    public Double getLength(){
        Double rise = rightPoint.getY() - leftPoint.getY();
        Double run = rightPoint.getX() - leftPoint.getX();
        return Math.sqrt((rise * rise) + (run * run));
    }

    public void move(Double deltaX, Double deltaY){
        leftPoint.move(deltaX, deltaY);
        rightPoint.move(deltaX, deltaY);
    }
}
