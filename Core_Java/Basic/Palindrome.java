import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=Reverse(num);
		sc.close();
		if(num==rev) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");		}
		

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

//123   30 3