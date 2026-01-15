package exceptionProgramming;
import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		//Arithmetic Operation
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		System.out.println("Main End");
		
		//Null Pointer Exception
//		String s=null;
//		System.out.println(s.toUpperCase());
		
		//NumberFormatException
//		int a=Integer.parseInt("123abc");
//		System.out.println(a);
		
		//String Index Out of Bound
//		String s="Hello";
//		System.out.println(s.charAt(7));
		
		
	}

}
