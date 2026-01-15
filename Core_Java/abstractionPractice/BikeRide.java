package abstractionPractice;

public class BikeRide extends Ride {
	public void calculateFare(int distance) {
		System.out.println("Bike Fare of "+distance+" km : "+distance*10);
	}
}
