package HashSet;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(10);
		s.add(5);
		s.add(7);
		s.add(9);
		s.add(15);
		s.add(12);
		System.out.println(s);
		
		TreeSet<Student>s1=new TreeSet<>(new StudentComparator());
		s1.add(new Student("Rahul",1));
		s1.add(new Student("Vishal",2));
		s1.add(new Student("Dipss",3));
		System.out.println(s1);
	}

}
