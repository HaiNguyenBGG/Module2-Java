public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2.0, "pink");
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(2.0, "pink", 3.0);
        System.out.println(cylinder1);
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());
    }
}