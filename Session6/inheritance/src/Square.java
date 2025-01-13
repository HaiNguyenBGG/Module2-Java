public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + super.getWidth() +
                ", color='" + super.getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }
}
