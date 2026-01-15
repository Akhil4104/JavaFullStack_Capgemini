package intermediateStringPractice;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		HashMap<Character,Integer>mp=new HashMap<>();
		String str="Programming";
		for(char ch:str.toCharArray()) {
			mp.put(ch,mp.getOrDefault(ch,0)+1);
		}
		for(char ch:str.toCharArray()) {
			if(mp.get(ch)==1) {
				System.out.println("First Non Repeating Character: "+ch);
				break;
			}
		}

	}

}
