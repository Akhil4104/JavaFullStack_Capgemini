package inheritance_Practice;

public class Car extends Vehicle{
	String brand;
	Car(int speed,String fuelType,String brand){
		super(speed,fuelType);
		this.brand=brand;
	}
	public void details() {
		System.out.println("Speed: "+speed);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Brand: "+brand);
	}
	
}
