import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new FictionBook("FB001", "The Great Gatsby", "F. Scott Fitzgerald", 110, "Classic Fiction");
        books[1] = new FictionBook("FB002", "To Kill a Mockingbird", "Harper Lee", 80, "Historical Fiction");
        books[2] = new FictionBook("FB003", "Pride and Prejudice", "Jane Austen", 50, "Romantic Fiction");
        books[3] = new ProgrammingBook("Java", "Spring Boot", "PB001", "Learn Java", "John Doe", 150);
        books[4] = new ProgrammingBook("Python", "Django", "PB002", "Master Python", "Jane Smith", 200);
        books[5] = new ProgrammingBook("JavaScript", "React", "PB003", "React Essentials", "Alan Turing", 120);

        System.out.println();
        printBookDetails(books);
        System.out.println();
        calculateTotalPrice(books);
        System.out.println();
        countProgrammingBooksByLanguage(books);
        System.out.println();
        countFictionBooksByCategory(books);
        System.out.println();
        printBooksByPrice(books);
    }

    public static void printBookDetails(Book[] books) {
        System.out.println("Book List:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void calculateTotalPrice(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books to calculate the total price: ");
        int count = sc.nextInt();
        sc.nextLine();

        Book[] selectedBooks = new Book[count];
        int totalPrice = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter book code " + (i + 1) + ": ");
            String bookCode = sc.nextLine().trim();
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (selectedBooks[j] != null && selectedBooks[j].getBookCode().equalsIgnoreCase(bookCode)) {
                    System.out.println("Book with code " + bookCode + " is already selected. Please enter a different code.");
                    found = true;
                    i--;
                    break;
                }
            }
            if (!found) {
                for (Book book : books) {
                    if (book.getBookCode().equalsIgnoreCase(bookCode)) {
                        totalPrice += book.getPrice();
                        selectedBooks[i] = book;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Book with code " + bookCode + " not found.");
                    selectedBooks[i] = null;
                }
            }
        }
        System.out.println("Selected Books:");
        for (Book book : selectedBooks) {
            if (book != null) {
                System.out.println(book);
            }
        }

        System.out.println("Total price of selected books: " + totalPrice);
    }

    public static void countProgrammingBooksByLanguage(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the programming language to search: ");
        String language = sc.nextLine().trim();

        int count = 0;
        System.out.println("Books with language '" + language + "':");
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                ProgrammingBook programmingBook = (ProgrammingBook) book;
                if (programmingBook.getLanguage().equalsIgnoreCase(language)) {
                    System.out.println(programmingBook);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No books found with language '" + language + "'.");
        } else {
            System.out.println("Number of ProgrammingBooks with language '" + language + "': " + count);
        }
    }

    public static void countFictionBooksByCategory(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the category to search: ");
        String category = sc.nextLine().trim();
        int count = 0;
        System.out.println("Books in category '" + category + "':");
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equalsIgnoreCase(category)) {
                    System.out.println(fictionBook);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No books found in category '" + category + "'.");
        } else {
            System.out.println("Number of FictionBooks in category '" + category + "': " + count);
        }
    }
    public static void printBooksByPrice(Book[] books) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum price to search for books: ");
        double maxPrice = sc.nextDouble();
        int count = 0;
        System.out.println("Book with price less than " + maxPrice + " : ");
        for( Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getPrice() < maxPrice) {
                    System.out.println(fictionBook);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No books found with price less than " + maxPrice + ".");
        }
    }
}