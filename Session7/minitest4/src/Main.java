import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialManager materialManagers = new MaterialManager();
        materialManagers.addMaterial((new CrispyFlour("CF001", "Crispy Flour 1", LocalDate.of(2024, 10, 15), 100, 2.0)));
        materialManagers.addMaterial((new CrispyFlour("CF002", "Crispy Flour 2", LocalDate.of(2024, 10, 24), 150, 6.0)));
        materialManagers.addMaterial((new CrispyFlour("CF003", "Crispy Flour 3", LocalDate.of(2024, 11, 6), 200, 4.0)));
        materialManagers.addMaterial((new CrispyFlour("CF004", "Crispy Flour 4", LocalDate.of(2024, 12, 28), 250, 8.0)));
        materialManagers.addMaterial((new CrispyFlour("CF005", "Crispy Flour 5", LocalDate.of(2025, 1, 5), 300, 9.0)));
        materialManagers.addMaterial((new Meat("M001", "Meat 1", LocalDate.of(2025, 1, 10), 50, 1.0)));
        materialManagers.addMaterial((new Meat("M002", "Meat 2", LocalDate.of(2025, 1, 11), 100, 2.0)));
        materialManagers.addMaterial((new Meat("M003", "Meat 3", LocalDate.of(2025, 1, 12), 150, 3.0)));
        materialManagers.addMaterial((new Meat("M004", "Meat 4", LocalDate.of(2025, 1, 13), 200, 5.0)));
        materialManagers.addMaterial((new Meat("M005", "Meat 5", LocalDate.of(2025, 1, 14), 300, 10.0)));

        System.out.println("Materials:");
        materialManagers.getMaterials().forEach(material ->
                System.out.println("Id: " + material.getId() + " - Name: " + material.getName() + " - Manufacture Date: " + material.getManufactureDate() + " - Cost: " + material.getCost() + " - Amount: " + material.getAmount()));

        System.out.println();
        System.out.println("Total cost: " + materialManagers.calculateTotalCost());

        System.out.println("Sorted materials by amount:");
        materialManagers.sortMaterials();
        materialManagers.getMaterials().forEach(material ->
                System.out.println(material.getName() + " - Amount: " + material.getAmount()));

        System.out.println();
        System.out.println("Discount: " + materialManagers.calculateDiscount());

        materialManagers.removeMaterial("CF003");
        System.out.println("List after removing CF003:");
        materialManagers.getMaterials().forEach(material ->
                System.out.println("Id: " + material.getId() + " - Name: " + material.getName() + " - Manufacture Date: " + material.getManufactureDate() + " - Cost: " + material.getCost() + " - Amount: " + material.getAmount()));
        System.out.println();

        materialManagers.updateMaterial(new CrispyFlour("CF005", "Crispy Flour 5", LocalDate.of(2025, 1, 4), 125, 10.0));
        System.out.println("List after updating CF005:");
        materialManagers.getMaterials().forEach(material ->
                System.out.println("Id: " + material.getId() + " - Name: " + material.getName() + " - Manufacture Date: " + material.getManufactureDate() + " - Cost: " + material.getCost() + " - Amount: " + material.getAmount()));
    }
}