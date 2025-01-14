import java.util.ArrayList;
import java.util.List;

class MaterialManager {
    private List<Material> materials = new ArrayList<>();

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void updateMaterial(Material material) {
        for (int i = 0; i < materials.size(); i++) {
            if (materials.get(i).getId().equals(material.getId())) {
                materials.set(i, material);
                return;
            }
        }
    }

    public void removeMaterial(String id) {
        materials.removeIf(material -> material.getId().equals(id));
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Material material : materials) {
            totalCost += material.getAmount();
        }
        return totalCost;
    }

    public void sortMaterials() {
        materials.sort((m1, m2) -> Double.compare(m1.getAmount(), m2.getAmount()));
    }

    public double calculateDiscount() {
        double discountAmount = 0;
        for (Material material : materials) {
            if (material instanceof Meat) {
                discountAmount += material.getAmount() * 0.9;
            } else if (material instanceof CrispyFlour) {
                discountAmount += material.getAmount() * 0.95;
            }
        }
        return calculateTotalCost() - discountAmount;
    }

    public List<Material> getMaterials() {
        return materials;
    }
}