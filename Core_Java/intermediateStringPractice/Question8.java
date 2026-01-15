package intermediateStringPractice;

public class Question8 {

	public static void main(String[] args) {
		String str="hello world";
		String s[]=str.split(" ");
		String ans="";
		for(String st:s) {
			ans+=Character.toUpperCase(st.charAt(0))+st.substring(1)+" ";
		}
		System.out.println("Capitalize first letter: "+ans);
	}

}
