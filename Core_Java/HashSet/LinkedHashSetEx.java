package HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String args[]) {
		LinkedHashSet s=new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add("Hello");
		s.add(null);
		System.out.println(s);
	}
}
