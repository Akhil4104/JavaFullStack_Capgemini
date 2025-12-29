import java.util.*;
class Dynamic1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='A' || ch=='a'){
			System.out.println(ch+" for Apple");
		}
		else if(ch=='B' || ch=='b'){
			System.out.println(ch+" for Ball");
		}
		else if(ch=='C' || ch=='c'){
			System.out.println(ch+" for Cat");
		}
		else if(ch=='D' || ch=='d'){
			System.out.println(ch+" for Dog");
		}
		else if(ch=='E' || ch=='e'){
			System.out.println(ch+" for Elephant");
		}
		else{
			System.out.println(":) !");
		}
				
	}
}
