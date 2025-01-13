public class Main {
    public static void main(String[] args) {
        Point2D point = new Point2D();
        System.out.println(point);

        Point2D point2D = new Point3D();
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point2D point2D1 = new Point3D(1, 2, 5);
        if (point2D1 instanceof Point3D) {
            Point3D point3D1 = (Point3D) point2D1;
            System.out.println(point3D1);
        }else{
            System.out.println("Not a Point3D");
        }
    }
}