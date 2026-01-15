package intermediateStringPractice;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		String str="Hello";
		HashMap<Character,Integer>mp=new HashMap<>();
		for(char ch:str.toCharArray()) {
			mp.put(ch,mp.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>m:mp.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}

}
