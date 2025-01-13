public class Book {
    private String bookCode;
    private String name;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String bookCode, String name, String author, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format(
                "Book { Code: %s'%s'%s, Name: %s'%s'%s, Author: %s'%s'%s, Price: %s%d%s }",
                ConsoleColors.YELLOW, bookCode, ConsoleColors.RESET,
                ConsoleColors.CYAN, name, ConsoleColors.RESET,
                ConsoleColors.GREEN, author, ConsoleColors.RESET,
                ConsoleColors.RED, price, ConsoleColors.RESET
        );
    }
}
