package HashSet;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add(16);
		s.add(18);
		s.add(32);
		s.add(null);
		
		System.out.println(s);
		
		System.out.println(s.contains(16));
		for(Object o:s) {
			System.out.println(o);
		}
	}

}
