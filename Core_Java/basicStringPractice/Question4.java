package basicStringPractice;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aba";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome ");
		}
		else {
			System.out.println("Not a Palindrome ");
		}
	}

}
