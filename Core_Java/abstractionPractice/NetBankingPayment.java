package abstractionPractice;

public class NetBankingPayment extends Payment{
	public void processPayment(double amount) {
		System.out.println("Net Banking Payment is $"+amount);
	}
}
