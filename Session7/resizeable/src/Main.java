import geometry.Circle;
import geometry.Rectangle;
import geometry.Square;
import resizeable.Resizeable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(3.5, 4.6);
        shapes[2] = new Square(3.5);
        Random random = new Random();
        for (Resizeable shape : shapes) {
            System.out.println("Before resize:"+shape);
            double percent = 1 + random.nextDouble() * 99;
            shape.resize(percent);
            System.out.println("After resize:"+shape);
        }
    }
}