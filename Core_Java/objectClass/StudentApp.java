package objectClass;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Kavya",1);
		Student s2=new Student("Kavya",1);
		Student s3=s1;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3); //multiple reference block pointing too same reference block
		System.out.println(s1.equals(s3));	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
		System.out.println(s1.getClass());
		
	}

}
