package intermediateStringPractice;

public class Question7 {

	public static void main(String[] args) {
		String str="Hello World";
		String s[]=str.split(" ");
		String res="";
		for(String ch:s) {
			String rev="";
			for(int i=ch.length()-1;i>=0;i--) {
				rev+=ch.charAt(i);
			}
			res+=rev+" ";
		}
		System.out.println(res.trim());
	}

}
