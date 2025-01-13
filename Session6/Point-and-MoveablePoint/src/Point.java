public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    // Constructors
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters và Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
