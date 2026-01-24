package regEx;

public class RegEx1 {

	public static void main(String[] args) {
		String s1="1";
		System.out.println(s1.matches("\\d"));
		
		System.out.println("--------------");
		String s2="123";
		System.out.println(s2.matches("\\d+"));
		
		System.out.println("--------------");
		String s3="";
		System.out.println(s3.matches("\\d*"));
		
		System.out.println("--------------");
		String s4="4568";
		System.out.println(s4.matches("^\\d+$"));  //from starting to end it contains the digit
		
		System.out.println("--------------");
		String s5="123";
		System.out.println(s5.matches("\\d{3}"));
		
		System.out.println("--------------");
		String s6="123";    
		System.out.println(s6.matches("\\d{3,8}"));
		System.out.println("--------------");
		String s7="10.5";
		System.out.println(s7.matches("^\\d+\\.\\d$"));
		
	}
}
