import java.util.*;
class Divisible 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 && n%11==0){
			System.out.println(n+" is Divisible by both 5 and 11");
		}
		else{
			System.out.println(n+" is not Divisible by both 5 and 11");
		}
	}
}
