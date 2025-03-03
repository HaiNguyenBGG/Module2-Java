public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product("1", "Iphone 13", 12000000));
        productManager.add(new Product("2", "Iphone 12", 10000000));
        productManager.add(new Product("3", "Iphone 11", 8000000));
        productManager.add(new Product("4", "Iphone X", 6000000));
        productManager.add(new Product("5", "Iphone 8", 5000000));
        productManager.add(new Product("6", "Iphone 7", 4000000));
        productManager.add(new Product("7", "Iphone 6", 3000000));
        productManager.add(new Product("8", "Iphone 5", 2000000));
        productManager.add(new Product("9", "Iphone 4", 1000000));
        productManager.add(new Product("10", "Iphone 3", 500000));

        System.out.println("Products List: ");
        productManager.display();

        System.out.println("After update: ");
        productManager.update(0, new Product("1", "Iphone 14", 15000000));
        productManager.display();

        System.out.println("Search by name: ");
        Product product = productManager.findByName("Iphone 11");
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Not found");
        }

        System.out.println("Sort by price ascending: ");
        productManager.sortByPriceAscending();
        productManager.display();

        System.out.println("Sort by price descending: ");
        productManager.sortByPriceDescending();
        productManager.display();

        System.out.println("After delete: ");
        productManager.delete(3);
        productManager.display();
    }
}