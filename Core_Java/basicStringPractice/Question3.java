package basicStringPractice;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse of String: "+rev);
		
		StringBuilder st=new StringBuilder(str);
		st.reverse();
		System.out.println("Reverse of String using StringBuilder: "+st.toString());
		
	}
}
