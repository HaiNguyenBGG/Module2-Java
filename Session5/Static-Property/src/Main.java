public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("Toyota", "Camry", "Red", 50000);
        System.out.println(Cars.year);
        Cars car2 = new Cars("Honda", "Civic", "Blue", 40000);
        System.out.println(Cars.year);
        Cars car3 = new Cars("Ford", "Mustang", "Black", 60000);
        System.out.println(Cars.year);
    }
}