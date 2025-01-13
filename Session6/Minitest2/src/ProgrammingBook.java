public class ProgrammingBook extends Book {
    String language;
    String framework;

    public ProgrammingBook() {
    }

    public ProgrammingBook(String language, String framework, String bookCode, String name, String author, int price) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public int getPrice() {
        return (int) (super.getPrice() * 0.95);
    }

    @Override
    public String toString() {
        return String.format(
                "%s, ProgrammingBook { Language: %s'%s'%s, Framework: %s'%s'%s }",
                super.toString(),
                ConsoleColors.BLUE, language, ConsoleColors.RESET,
                ConsoleColors.PURPLE, framework, ConsoleColors.RESET
        );
    }
}
