import java.util.*;
class Eligible 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=18){
			System.out.println("Is Eligible to Vote");
		}
		else{
			System.out.println("Is not Eligible to Vote");
		}
	}
}
