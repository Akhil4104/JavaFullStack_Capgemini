package Basic;
import java.util.*;
class loop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			System.out.println("Welcome");
			System.out.println("Do you want to repeat:type y for yes and n for no");
			ch=sc.next().charAt(0);
		}
		while(ch=='y');
	}
}
