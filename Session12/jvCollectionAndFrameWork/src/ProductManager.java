import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> products = new LinkedList<Product>();
//    private ArrayList<Product> products = new ArrayList<Product>();

    public void add(Product product) {
        products.add(product);
    }

    public void update(int index, Product product) {
        products.set(index, product);
    }

    public void delete(int index) {
        products.remove(index);
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparingInt(Product::getPrice));
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparingInt(Product::getPrice).reversed());
    }
}
