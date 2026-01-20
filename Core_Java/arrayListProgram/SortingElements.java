package arrayListProgram;

import java.util.ArrayList;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(5);
		a1.add(70);
		a1.add(2);
		a1.add(11);
		System.out.println("===Before Sorting===");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("===After Sorting===");
		System.out.println(a1);
	}

}
