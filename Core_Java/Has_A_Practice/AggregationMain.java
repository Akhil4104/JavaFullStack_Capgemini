package Has_A_Practice;
import java.util.*;
public class AggregationMain {
	public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "James Gosling");
        Book b2 = new Book(102, "Clean Code", "Robert Martin");
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        Library cityLib = new Library("City Central Library", bookList);
        cityLib.displayLibrary();
        cityLib = null;
        System.out.println("\nLibrary is gone, but the book remains:");
        b1.display(); 
    }
}
