public class Geometric {
    private String color;
    private boolean filled;

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public void displayGeometric() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
}
