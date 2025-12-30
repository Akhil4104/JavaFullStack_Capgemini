package Basic;
import java.util.*;
class Divisibles
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0){
			System.out.println(n+" Is Divisble by 5");
		}
		else{
			System.out.println(n+" Is Not Divisible by 5");
		}

	}
}
