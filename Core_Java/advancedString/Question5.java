package advancedString;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer>mp=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			mp.put(ch,mp.getOrDefault(ch,0)+1);
		}
		for(Map.Entry<Character,Integer>map:mp.entrySet()){ 
			System.out.print(map.getKey()+""+map.getValue());
		}
	}

}
