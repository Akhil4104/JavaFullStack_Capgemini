package abstractionPractice;

public class UPIPayment extends Payment{
	@Override
	public void processPayment(double amount) {
		System.out.println("UPI Payment is $"+amount);
	}
}
