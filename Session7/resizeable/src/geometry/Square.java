package geometry;

import resizeable.Resizeable;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square{" + super.getArea()/super.getWidth() +
                "Area: " + getArea() +
                '}';
    }
}
