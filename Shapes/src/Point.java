import java.util.Objects;

public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = Objects.requireNonNullElse(x, 0.0);
        this.y = Objects.requireNonNullElse(y, 0.0);
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Point clone(){
        return new Point(this.x, this.y);
    }

    public void move(Double deltaX, Double deltaY){
        this.x += deltaX;
        this.y += deltaY;
    }
}
