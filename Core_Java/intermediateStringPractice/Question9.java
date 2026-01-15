package intermediateStringPractice;

public class Question9 {

	public static void main(String[] args) {
		String str="Java is a Programming language";
		String s[]=str.split(" ");
		String word=s[0];
		for(String st:s) {
			if(st.length()>word.length()) {
				word=st;
			}
		}
		System.out.println("Longest Word: "+word);

	}

}
