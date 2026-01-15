package exceptionProgramming;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		if(b==0) {
			throw new WrongInputException("/ by 0");
		}
		else {
			System.out.println(a/b);
		}

	}

}
