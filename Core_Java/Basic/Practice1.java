package Basic;
import java.util.*;
class Practice1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Length of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Array: ");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
