package apiStream;
import java.util.*;
import java.util.stream.Collectors;
public class StreamEx {
	public static void main(String agrs[]) {
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		System.out.println("==================");
		a1.stream().forEach(System.out::println);
		
		System.out.println("==================");
		List<String>name=new ArrayList<>(Arrays.asList("Shrddha","Kavya","Rohit"));
		name.stream()
		.forEach(System.out::println);
		
		//count()-return long type of data
		long count=name.stream().count();
		System.out.println(count);
		
		System.out.println("=================");
		//filter
		name.stream()
		.filter(s->s.length()>5)
		.forEach(System.out::println);
		
		System.out.println("=================");
		List<Integer>numbers=Arrays.asList(1,2,3,4,4,5,5,6,7,8,9);
		numbers.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
		
		System.out.println("=================");
		name.stream()
		.map(s->s.toUpperCase())
		.forEach(System.out::println);
		
		System.out.println("=================");
		name.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("=================");
		numbers.stream()
		.sorted((a,b)->b.compareTo(a))
		.forEach(System.out::println);
		
		System.out.println("=================");
		List<Integer>doubled=numbers.stream()
				.map(n->n*2)
				.collect(Collectors.toList());
		System.out.println(doubled);
		
		System.out.println("=================");
		List<Integer>ans=numbers.stream()
		.map(s->s*5)
		.collect(Collectors.toList());
		System.out.println(ans);
				
		
		
		
	}
}
