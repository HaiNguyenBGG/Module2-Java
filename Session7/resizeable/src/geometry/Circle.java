package geometry;

import resizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent / 100;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
