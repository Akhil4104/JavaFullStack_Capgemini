package stringProgram;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		//length of string
		System.out.println(s1.length());
		//convert to uppercase of string
		System.out.println(s1.toUpperCase());
		//convert to lowercase of string
		System.out.println(s1.toLowerCase());
		//start with H
		System.out.println(s1.startsWith("H"));
		//end with o 
		System.out.println(s1.endsWith("o"));
		//char at 0 index
		System.out.println(s1.charAt(0));
		//convert to character array
		System.out.println(s1.toCharArray());
		
		String s2="Hi Hello Bye";
		//split the string into array
		String str[]=s2.split(" ");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		//concat two string
		String x="Hii";
		System.out.println(x.concat("Everyone"));
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.substring(2,4));
		
	}

}
