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
        return Math.sqrt(Math.pow(radius * Math.cos(Math.PI/10), 2) + Math.pow(radius - radius * Math.sin(Math.PI/10), 2));
    }

    private Double getApothem(Double base){
        return base / (2 * Math.tan(Math.PI/5));
    }

    public Point getCenter() {
        return center;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        Double base = getBase();
        System.out.println(base);
        return 2.5 * base * getApothem(base);
    }

    @Override
    public void move(Double deltaX, Double deltaY) {
        this.center.move(deltaX, deltaY);
    }
}
