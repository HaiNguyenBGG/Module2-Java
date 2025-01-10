public class Test2 extends Test {
//    public void Atest() {
//        System.out.println("Con");
//    }

    public static void main(String[] args) {
        displayGeometricObject(new Circle(1, "red", false));
        displayGeometricObject(new Rectangle(1, 1, "black", true));
    }
    public static void displayGeometricObject(Geometric geometricObj){
        System.out.println("Created on " + geometricObj.getDateCreated()+
                ". Color is " +geometricObj.getColor());
    }

}
