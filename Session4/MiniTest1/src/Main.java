import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[6];
        books[0] = new Book("BK01", "Tsubasa", "Minh", 100);
        books[1] = new Book("BK02", "Naruto", "Huy", 200);
        books[2] = new Book("BK03", "One Piece", "Minh", 300);
        books[3] = new Book("BK04", "Conan", "Long", 70);
        books[4] = new Book("BK05", "Dragon Ball", "Long", 30);
        books[5] = new Book("BK06", "One Punch Man", "Ánh", 600);

        // Hiển thị danh sách sách
        printBooks(books);

        // Nhập và hiển thị thông tin sách cần mua
        System.out.print("\nEnter the number of books you want to buy: ");
        int numberOfBooks = sc.nextInt();
        sc.nextLine(); // Clear buffer
        String[] bookCodes = new String[numberOfBooks];

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.print("Enter the code of book " + (i + 1) + ": ");
            bookCodes[i] = sc.nextLine();
        }

        System.out.println("\nBooks you selected:");
        double totalPrice = calculateTotalPriceAndPrintBooks(books, bookCodes);
        System.out.printf("Total price: %.2f%n", totalPrice);

        // Hiển thị sách theo tác giả
        System.out.print("\nEnter the name of author: ");
        String authorName = sc.nextLine();
        printBooksByAuthor(books, authorName);

        // Hiển thị sách theo giá tiền
        System.out.print("\nEnter the maximum price: ");
        double maxPrice = sc.nextDouble();
        printBooksByPrice(books, maxPrice);

        // Hiển thị thông tin sách theo mã
        sc.nextLine(); // Clear buffer
        System.out.print("\nEnter the code of the book you want to view: ");
        String bookCode = sc.nextLine();
        printBookByCode(books, bookCode);
    }

    public static void printBooks(Book[] books) {
        System.out.println("\nList of all books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printBooksByAuthor(Book[] books, String authorName) {
        System.out.println("\nBooks written by " + authorName + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthorName().equalsIgnoreCase(authorName)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by " + authorName + ".");
        }
    }

    public static void printBooksByPrice(Book[] books, double maxPrice) {
        System.out.println("\nBooks priced below " + maxPrice + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.getPrice() < maxPrice) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found below " + maxPrice + ".");
        }
    }

    public static void printBookByCode(Book[] books, String bookCode) {
        System.out.println("\nBook with code " + bookCode + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.getBookCode().equalsIgnoreCase(bookCode)) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with code " + bookCode + ".");
        }
    }

    public static double calculateTotalPriceAndPrintBooks(Book[] books, String[] bookCodes) {
        double totalPrice = 0;
        for (String code : bookCodes) {
            boolean found = false;
            for (Book book : books) {
                if (book.getBookCode().equalsIgnoreCase(code)) {
                    System.out.println(book);
                    totalPrice += book.getPrice();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Book with code " + code + " not found.");
            }
        }
        return totalPrice;
    }
}
