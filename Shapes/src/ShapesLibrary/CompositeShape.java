package ShapesLibrary;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {
    private List<Shape> shapes;

    public CompositeShape(){
        shapes = new ArrayList<Shape>();
    }

    @Override
    public Shape getShape(int i){
        return shapes.get(i);
    }

    @Override
    public void add(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void remove(Shape shape){
        shapes.remove(shape);
    }

    @Override
    public Double getArea(){
        Double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

    public void move(Double deltaX, Double deltaY){
        for (Shape shape : shapes){
            shape.move(deltaX, deltaY);
        }
    }
}
