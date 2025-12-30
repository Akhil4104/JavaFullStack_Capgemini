package Basic;
import java.util.*;
class Multiple 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%10==0){
			System.out.println(n+" Is a Multiple of 10");
		}
		else{
			System.out.println(n+" Is not Multiple of 10");
		}
	}
}
