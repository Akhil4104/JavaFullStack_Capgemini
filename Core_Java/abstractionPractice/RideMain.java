package abstractionPractice;
public class RideMain {
	public static void main(String[] args) {
		Ride r;
		r=new BikeRide();
		r.calculateFare(2);
		r=new AutoRide();
		r.calculateFare(3);
		r.rideDetails();
	}
}
