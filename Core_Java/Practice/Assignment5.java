import java.util.*;
class Assignment5
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
		for(int i=0;i<n;i++){
			if(arr[i]%2!=0){
				System.out.print(arr[i]+" ");
			}
		}
	}
}
//WAJP Print odd element in an array?