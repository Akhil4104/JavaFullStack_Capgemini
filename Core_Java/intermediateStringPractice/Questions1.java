package intermediateStringPractice;

public class Questions1 {
	public static void main(String[] args) {
		String a="abcabcad";
		String b="abc";
		int cnt=0;
		for(int i=0;i<=a.length()-b.length();i++) {
			if(a.substring(i,i+b.length()).equals(b)) {
				cnt++;
			}
		}
		System.out.println("Count Occurrences : "+cnt);

	}

}
