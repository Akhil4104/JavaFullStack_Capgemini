package advancedString;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int res=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			res=res*10+ch-'0';
		}
		System.out.println(res);
	}

}
