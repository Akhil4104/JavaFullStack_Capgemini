import java.util.*;
class Assignments3
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
		int sum=0,cnt=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				sum+=arr[i];
				cnt++;
			}
		}
		int res=sum/cnt;
		System.out.print(res);
	}
}
//WAJP Find Average of even element in an array?
