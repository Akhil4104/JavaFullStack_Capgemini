package objectClass;

public class PhoneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1=new Phone(5,5);
		Phone arr[]={
				new Phone(5,10),
				new Phone(6,12),
				new Phone(8,14)
				};
		System.out.println(p1.toString());
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);

	}

}
