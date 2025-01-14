package geometry;

import resizeable.Resizeable;

public class Rectangle implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {}
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent / 100;
        this.height = this.height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}