package hasARelationship;

public class Book {
    private String bookName;
    private Pages[] pages = {
        new Pages("Page 1: Introduction"),
        new Pages("Page 2: OOPS Concepts"),
        new Pages("Page 3: HAS-A Relationship")
    };

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Pages[] getPages() {
        return pages;
    }

    public void setPages(Pages[] pages) {
        this.pages = pages;
    }

    // Constructors
    Book() {
    }

    Book(String bookName) {
        this.bookName = bookName;
    }
}
