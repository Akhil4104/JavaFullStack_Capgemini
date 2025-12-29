import java.util.*;
class Decision 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age==21){
			System.out.println("Welcome Your are Enrolled Thank You!");
		}
		else if(age==16){
			System.out.println("Welcome Thank You!");
		}
		else{
			System.out.println("");
		}
	}
}
