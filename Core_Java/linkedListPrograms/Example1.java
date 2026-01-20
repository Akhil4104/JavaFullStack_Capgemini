package linkedListPrograms;

import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Hello");
		list.add("null");
		System.out.println(list);
		
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(30));

		for(Object o:list) {
			System.out.println(o);
		}
		
	}

}
