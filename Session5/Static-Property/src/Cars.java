public class Cars {
    private String brand;
    private String model;
    private String color;
    private int price;
    public static int year = 2022;

    public Cars(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        year++;
    }

}
