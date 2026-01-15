package abstractionPractice;

public abstract class Payment {
	abstract void processPayment(double amount);
	public void printReceipt() {
		System.out.println("Payment is Successful.Receipt is genrated");
	}
}
