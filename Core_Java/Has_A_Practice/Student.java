package Has_A_Practice;

public class Student{
	String name;
	Address address;
	Student(String name,Address address){
		this.name=name;
		this.address=address;
	}
	public void details() {
		System.out.println("Name: "+name);
		System.out.println("City: "+address.City);
		System.out.println("State: "+address.State);
		System.out.println("Pincode: "+address.pincode);
		
	}
}
