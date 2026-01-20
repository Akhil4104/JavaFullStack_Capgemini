package arrayListProgram;
import java.util.*;
public class Book implements Comparable<Book>{
	int price;
	Book(){
		
	}
	Book(int price){
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book [Price= "+price+"]";
	}
	
	@Override
	public int compareTo(Book o) {
		return this.price-o.price;
	}
	
}
