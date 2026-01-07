package Has_A_Practice;

public class Book {
	int bookId;
	String title;
	String author;
	Book(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	void display() {
		System.out.println("Book Id: "+bookId+" | title: "+title+" |author: "+author);
	}
}
