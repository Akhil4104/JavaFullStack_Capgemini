package Has_A_Practice;
import java.util.*;
public class Library {
	String libname;
	List<Book> books;
	
	Library(String libname,List<Book>books){
		this.libname=libname;
		this.books=books;
	}
	void displayLibrary() {
        System.out.println("Library: " + libname);
        System.out.println("--- Books Available ---");
        for (Book b : books) {
            b.display();
        }
    }
}
