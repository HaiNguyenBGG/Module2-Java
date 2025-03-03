import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private double price;
    private String manufacturer;
    private String description;

    public Product(String id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Mã: " + id + ", Tên: " + name + ", Giá: " + price + ", Hãng: " + manufacturer + ", Mô tả: " + description;
    }
}
class ProductManager {
    private List<Product> products;
    private static final String FILE_NAME = "products.dat";

    public ProductManager() {
        products = new ArrayList<>();
        loadProducts();
    }

    public void addProduct(Product product) {
        products.add(product);
        saveProducts();
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    public Product searchProductById(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    private void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            products = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class ProductBinaryFileApp {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String description = scanner.nextLine();
                    manager.addProduct(new Product(id, name, price, manufacturer, description));
                    System.out.println("Sản phẩm đã được thêm.");
                    break;

                case 2:
                    manager.displayProducts();
                    break;

                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    String searchId = scanner.nextLine();
                    Product found = manager.searchProductById(searchId);
                    if (found != null) {
                        System.out.println("Thông tin sản phẩm: " + found);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
