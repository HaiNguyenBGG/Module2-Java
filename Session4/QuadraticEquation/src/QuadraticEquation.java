public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return 0;
        }
    }
}
