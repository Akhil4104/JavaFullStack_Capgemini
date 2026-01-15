package abstractionPractice;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment(double amount) {
		System.out.println("Credit Card Payment is $"+amount);
	}
}
