package wrapperClass;
import java.util.*;
public class AddingData {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(null);
		a1.add("Hello");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(50);
		a2.add(60);
		a2.add(70);
		a2.addAll(0,a1);
		System.out.println(a2);
		
		a1.add(4,50);
		System.out.println(a1);
		a1.add(0,5);
		System.out.println(a1);
	}

}
