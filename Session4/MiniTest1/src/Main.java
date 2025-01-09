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

        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        System.out.println("Total price: " + totalPrice);

        System.out.println("Books priced from 100 and above: ");
        for (Book book : books) {
            if (book.getPrice() >= 100) {
                System.out.println(book.getBookName());
            }
        }
        System.out.print("Enter author name: ");
        String authorName = sc.nextLine();
        System.out.println("Books written by " + authorName + ": ");
        boolean foundAuthor = false;
        for (Book book : books) {
            if (book.getAuthorName().equals(authorName)) {
                System.out.println(book.getBookName());
                foundAuthor = true;
            }
        }
        if (!foundAuthor) {
            System.out.println("No books written by " + authorName);
        }
        System.out.println();
        System.out.print("Enter book code: ");
        String bookCode = sc.nextLine();
        System.out.print("Books code " + bookCode + ": ");
        boolean foundBookCode = false;
        for (Book book : books) {
            if (book.getBookCode().equals(bookCode)) {
                System.out.printf("Name: " + book.getBookName() + ". Author: " + book.getAuthorName() + ". Price: " + book.getPrice());
                foundBookCode = true;
            }
        }
        if (!foundBookCode) {
            System.out.println("No books with code " + bookCode);
        }
    }
}