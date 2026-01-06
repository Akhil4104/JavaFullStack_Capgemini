package inheritance;
import java.util.*;
public class Ola {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Cab");
		System.out.println("1: Mini");
		System.out.println("2: Sedan");
		System.out.println("3: Luxary");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		Cab c=null; //can't be empty
		//Non-Primitive-upcasting
		switch(choice) {
		case 1:{
			c=new Mini();
		}
		break;
		case 2:{
			c=new Sedan();
		}
		break;
		case 3:{
			c=new Luxary();
		}
		break;
		default:{
			System.out.println("Invalid Input");
		}
		System.out.println(c);
		}
	}
}
