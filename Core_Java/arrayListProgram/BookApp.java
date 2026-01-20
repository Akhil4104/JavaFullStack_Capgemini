package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;

public class BookApp {

	public static void main(String[] args) {
		ArrayList books=new ArrayList();
		books.add(new Book(1000));
		books.add(new Book(100));
		books.add(new Book(150));
		books.add(new Book(50));
		books.add(new Book(20));
		books.add(new Book(500));
		Collections.sort(books,new BookComparator());
		System.out.println(books);
		
	}

}
