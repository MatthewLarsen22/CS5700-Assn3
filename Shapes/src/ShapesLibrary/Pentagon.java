package ShapesLibrary;

public class Pentagon extends Shape {
    private Point center;
    private Double radius;

    public Pentagon(Point center, Double radius){
        this.center = center;
        if(radius > 0.0){
            this.radius = radius;
        }
        else{
            throw new RuntimeException("A pentagon cannot have a radius of 0 or less.");
        }
    }

    private Double getBase(){
        return 2 * radius * Math.sin(36);
    }

    private Double getApothem(){
        return radius * Math.cos(36);
    }

    public Point getCenter() {
        return center;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return 2.5 * getBase() * getApothem();
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        this.center.move(deltaX, deltaY);
    }
}
