import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quantity;

    public CrispyFlour(String id, String name, LocalDate manufactureDate, int cost, double quantity) {
        super(id, name, manufactureDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpirationDate() {
        return getManufactureDate().plusYears(1);
    }

}
