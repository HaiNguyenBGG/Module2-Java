public class Main {
    public static void main(String[] args) {
        Geometric geometric = new Circele("red", true);
        Geometric geometric1 = new Rectangle("blue", false);

        geometric.displayGeometric();
        geometric1.displayGeometric();
    }
}