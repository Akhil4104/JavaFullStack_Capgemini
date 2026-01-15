package basicStringPractice;

public class Question2 {

	public static void main(String[] args) {
		String str="Hello World!";
		int i=0;
		while(true) {
			try {
				str.charAt(i);
				i++;
			}
			catch(Exception e) {
				break;
			}
		}
		System.out.println("Length of String: "+i);
	}

}
