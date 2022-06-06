package ShapesLibrary;

public abstract class Shape implements Moveable {

    public Shape getShape(int i){
        throw new UnsupportedOperationException();
    }

    public void add(Shape shape){
        throw new UnsupportedOperationException();
    }

    public void remove(Shape shape){
        throw new UnsupportedOperationException();
    }

    public Double getArea(){
        throw new UnsupportedOperationException();
    }

    @Override
    public void move(Double deltaX, Double deltaY){
        throw new UnsupportedOperationException();
    }
}
