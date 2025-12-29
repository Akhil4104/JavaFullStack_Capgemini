import java.util.Scanner;

public class ArrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {121,11,13,16,131};
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			int rev=Reverse(curr);
			if(curr==rev) {
				System.out.println(curr+" Palindrome Number");
			}
			else {
				System.out.println(curr+" Not a Palindrome Number");
			}
			
		}
	}
	public static int Reverse(int n) {
		int ans=0;
		while(n>0) {
			int val=n%10;
			ans=ans*10+val;
			n=n/10;
		}
		return ans;
	}

}
