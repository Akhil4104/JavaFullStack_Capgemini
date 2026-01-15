package exceptionProgramming;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<16) {
			throw new UnderAgeException("Under Age");
		}
		else if(age>65) {
			throw new OverAgeException("Over Age");
		}
		else {
			System.out.println("You can vote");
		}
	}

}
