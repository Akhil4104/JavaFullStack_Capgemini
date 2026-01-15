package intermediateStringPractice;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		String s="Programming";
		LinkedHashSet<Character>mp=new LinkedHashSet<>();
		for(char ch:s.toCharArray()) {
			mp.add(ch);
		}
		StringBuilder st=new StringBuilder();
		for(char ch:mp) {
			st.append(ch);
		}
		System.out.println(st);

	}

}
