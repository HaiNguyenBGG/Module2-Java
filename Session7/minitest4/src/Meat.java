import java.time.LocalDate;

public class Meat extends Material {
    private double weight;
    public Meat(String id, String name, LocalDate manufactureDate, int cost, double weight) {
        super(id, name, manufactureDate, cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight * getCost();
    }
    @Override
    public LocalDate getExpirationDate() {
        return getManufactureDate().plusDays(7);
    }
}
