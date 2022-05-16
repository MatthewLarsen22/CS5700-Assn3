import java.util.Objects;

public class Circle extends Ellipse{
    public Circle(Point center, Double horizontalRadius, Double verticalRadius) {
        super(center, horizontalRadius, verticalRadius);

        if(!Objects.equals(this.getHorizontalRadius(), this.getVerticalRadius())){
            throw new RuntimeException("A circle's radii must be of equal length.");
        }
    }
}
