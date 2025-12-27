import java.util.*;
class Assignments4
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
		int OddSum=0,EvenSum=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				OddSum+=arr[i];
			}
			else{
				EvenSum+=arr[i];
			}
		}
		int res=EvenSum-OddSum;
		System.out.print(res);
	}
}
//WAJP Find difference of Even sum and Odd sum?