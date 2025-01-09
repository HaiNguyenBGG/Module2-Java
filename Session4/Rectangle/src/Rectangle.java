
public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String display() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
