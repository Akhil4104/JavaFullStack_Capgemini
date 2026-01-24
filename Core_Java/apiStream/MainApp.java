package apiStream;

import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		List<Person>p=new ArrayList<>();
		p.add(new Person("Akhil", 22));
		p.add(new Person("Rahul", 23));
		p.add(new Person("Ankit", 24));
		p.add(new Person("Kavya", 21));
		p.add(new Person("Rohit", 25));
		
		p.stream()
		.filter(a->a.getName().toLowerCase().startsWith("a"))
		.forEach(a->System.out.println(a.getName()+" "+a.getAge()));
	}
}
