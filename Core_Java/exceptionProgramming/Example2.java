package exceptionProgramming;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
			String s=null;
			System.out.println(s.toUpperCase());
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Caught AE");
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Caught NPE");
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Caught NFE");
		}
		catch(Exception e) {
			System.out.println("Caught");
		}

	}

}
