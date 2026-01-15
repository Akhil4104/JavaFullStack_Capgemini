package intermediateStringPractice;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		char str[]=s1.toCharArray();
		char str1[]=s2.toCharArray();
		Arrays.sort(str);
		Arrays.sort(str1);
		if(Arrays.equals(str, str1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}

}
