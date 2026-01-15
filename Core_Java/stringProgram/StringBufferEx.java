package stringProgram;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);
		//insert
		s1.insert(1,"Hi");
		System.out.println(s1);
		//reverse
		s1.reverse();
		System.out.println(s1);
		//replace
		s1.replace(1, 3,"Zero");
		System.out.println(s1);
		
		s1.reverse();
		//delete
		System.out.println(s1.delete(4, s1.length()-1));
		
		//capacity buffer-16  (16*2)+2
		System.out.println(s1.capacity());		
		
		s1.append("abcdefghijklmnop");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		
		
	}

}
