package arrayListProgram;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList c1=new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.remove(0);
		System.out.println(c1);
		
		ArrayList c2=new ArrayList();
		c2.add(10);
		c2.add(20);
		c2.add(30);
		c2.add(50);
		System.out.println(c2);
		
//		c1.removeAll(c2);  remove all the common element from both arrayList
		c1.retainAll(c2);   //return the common element from both arrayList
		System.out.println(c1);
		
		c1.clear();
		System.out.println(c1);
	}

}
