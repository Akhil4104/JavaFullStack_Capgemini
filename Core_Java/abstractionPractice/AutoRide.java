package abstractionPractice;

public class AutoRide extends Ride{
	public void calculateFare(int distance) {
		System.out.println("Auto Fare of "+distance+" km : "+distance*15);
	}
}
