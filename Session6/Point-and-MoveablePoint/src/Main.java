public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println("Point: " + point);

        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println("Before move: " + movablePoint);
        movablePoint.move();
        System.out.println("After move: " + movablePoint);
    }
}