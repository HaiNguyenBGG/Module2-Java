import javafx.scene.shape.Circle;

public class Main {
    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        TestCircle circlelWithRadius = new TestCircle(5.0);

        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle Area : " + circle.getParent());

        System.out.println("Circle radius: " + circlelWithRadius.getRadius());
        System.out.println("Circle Area : " + circlelWithRadius.getParent());
    }
}