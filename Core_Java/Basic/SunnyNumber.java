import java.util.*;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int val=n;
		while(n>0){
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++){
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(sum==val){
			System.out.println(val+" is a sunny number");
		}
		else{
			System.out.println("not a sunny number");
		}
	}
}


//Sum of each factorial is equal to number