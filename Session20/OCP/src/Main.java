interface Shape {
    double calculateArea();
}
class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
//        Shape triangle = new Triangle(6, 8);

        AreaCalculator calculator = new AreaCalculator();
        Shape[] shapes = {rectangle, circle};

        System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
    }
}


//class Triangle implements Shape {
//    private double base, height;
//
//    public Triangle(double base, double height) {
//        this.base = base;
//        this.height = height;
//    }
//
//    public double calculateArea() {
//        return 0.5 * base * height;
//    }
//}

