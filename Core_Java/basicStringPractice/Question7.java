package basicStringPractice;

public class Question7 {

	public static void main(String[] args) {
		String str="Hello World";
		String[]word=str.trim().split("\\s+");
		System.out.println("Word Count: "+word.length);

	}

}
