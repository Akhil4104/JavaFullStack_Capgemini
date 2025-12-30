package Practice;
import java.util.*;
class Assignments2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Average: ");
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		int res=sum/n;
		System.out.print(res);
	}
}

//WAJP Find Average of an array?
