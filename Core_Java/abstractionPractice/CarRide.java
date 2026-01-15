package abstractionPractice;

public class CarRide extends Ride{
	public void calculateFare(int distance) {
		System.out.println("Car Ride: "+distance+"km :"+distance*20);
	}
}
