package Practice;
import java.util.*;
class Assignments1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Result: ");
		int sum=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2!=0){
				sum+=arr[i];
			}
		}
		System.out.print(sum);
	}
}

//WAJP Find Sum of Odd element in an array?