package exceptionProgramming;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
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
		finally {
			System.out.println("Execute Every Time");
		}

	}

}
