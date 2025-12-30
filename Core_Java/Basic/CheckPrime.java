package Basic;
import java.util.*;
class CheckPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				res=false;
			}
		}
		if(res){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not a Prime Number");
		}
	}
}
