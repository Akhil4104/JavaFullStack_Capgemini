package lamdaExpression;

import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new Book("Java",2000));
		a1.add(new Book("Python",1000));
		a1.add(new Book("c++",3000));
		System.out.println(a1);

	}

}
