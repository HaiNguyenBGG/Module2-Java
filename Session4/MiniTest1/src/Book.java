public class Book {
    String bookCode;
    String bookName;
    String authorName;
    double price;

    public Book() {

    }

    public Book(String bookCode, String bookName, String authorName, double price) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }
}
