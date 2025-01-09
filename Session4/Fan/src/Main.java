public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setOn(false);
        fan2.setColor("blue");

        System.out.println(fan1);
        System.out.println(fan2);
    }
}