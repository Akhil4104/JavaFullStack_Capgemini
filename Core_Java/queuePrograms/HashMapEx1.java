package queuePrograms;
import java.util.*;
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap mp=new HashMap();
		mp.put(1,"Rahul");
		mp.put(2,"Shraddha");
		mp.put(3,"Kavya");
		mp.put(4,"Suraj");
		mp.putIfAbsent(4,null);
		System.out.println(mp);
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
		
		for(Object o:mp.entrySet()) {
			System.out.println(o);
		}
		for(Object o:mp.keySet()) {
			System.out.println(o);
		}
	}
}
