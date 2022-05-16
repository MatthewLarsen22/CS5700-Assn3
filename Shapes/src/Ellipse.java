import java.util.Objects;

public class Ellipse extends Shape{

    private Point center;
    private Double horizontalRadius;
    private Double verticalRadius;

    public Ellipse(Point center, Double horizontalRadius, Double verticalRadius){
        this.center = Objects.requireNonNull(center);
        this.horizontalRadius = Objects.requireNonNull(horizontalRadius);
        this.verticalRadius = Objects.requireNonNull(verticalRadius);

        if(this.horizontalRadius == 0 || this.verticalRadius == 0){
            throw new RuntimeException("An ellipse cannot have an area of 0.");
        }
    }

    public Point getCenter(){
        return center;
    }

    public Double getHorizontalRadius(){
        return horizontalRadius;
    }

    public Double getVerticalRadius(){
        return verticalRadius;
    }

    @Override
    public Double getArea() {
        return Math.PI * horizontalRadius * verticalRadius;
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        center.move(deltaX, deltaY);
    }
}
