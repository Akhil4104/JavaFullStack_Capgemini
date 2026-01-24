package regEx;

public class AlphabetsRegex {

	public static void main(String[] args) {
		String s1="abc";
		System.out.println(s1.matches("[a-z]+"));
		
		System.out.println("------------------------");
		
		String s2="ABC";
		System.out.println(s2.matches("[A-Z]+"));
		

		System.out.println("------------------------");
		String s3="ABCdefg";
		System.out.println(s3.matches("^[a-zA-Z]+$"));


		System.out.println("------------------------");
		String s4="ABCdef123";
		System.out.println(s4.matches("^[a-zA-Z0-9]+$"));
		
		System.out.println("------------------------");
		String s5="abc@gmail.com";
		System.out.println(s5.matches("^[a-zA-Z0-9]+@gmail\\.com$"));
	}

}
