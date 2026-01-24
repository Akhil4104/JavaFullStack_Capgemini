package regEx;

public class Example1 {
	public static void main(String args[]) {
		String s1="123abc";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9') {
				continue;
			}
			else {
				System.out.println("Not Numeric String");
				break;
			}
		}
	}
}
